package com.weather.challenge.service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.dto.NewBoardDto;
import com.weather.challenge.dto.UserDto;
import com.weather.challenge.dto.external.ForecastDto;
import com.weather.challenge.dto.external.WeatherDto;
import com.weather.challenge.entity.Board;
import com.weather.challenge.entity.Forecast;
import com.weather.challenge.entity.Location;
import com.weather.challenge.entity.User;
import com.weather.challenge.entity.Weather;
import com.weather.challenge.repository.BoardRepository;
import com.weather.challenge.repository.LocationRepository;
import com.weather.challenge.repository.UserRepository;
import com.weather.challenge.repository.WeatherRepository;

@Service
public class WeatherService {

	@Autowired
	private BoardRepository boardRepository;

	@Autowired
	private WeatherRepository weatherRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Autowired
	private YahooService yahooService;

	@Autowired
	private UserRepository userRepository;
	
	public List<BoardDto> getBoards(UserDto user) {
		List<Board> boards = boardRepository.getByUserId(user.getId());
		List<BoardDto> retBoards = new ArrayList<BoardDto>();
		if (!boards.isEmpty()) {
			BoardDto boardDto = null; 
			for (Board board : boards) {
				boardDto = new BoardDto();
				boardDto.setId(board.getId());
				boardDto.setDescription(board.getDescription());
				List<Location> boardLocations = locationRepository.getByBoardsId(board.getId());
				List<LocationDto> locationDtos = new ArrayList<>();
				for (Location location : boardLocations) {
					LocationDto locationDto = mapLocationToLocationDto(location);
					locationDtos.add(locationDto);
				}
				boardDto.setLocations(locationDtos);
				retBoards.add(boardDto);
			}
		}
		return retBoards;
	}

	private ForecastDto mapForecastToForecastDto(Forecast forecast) {
		ForecastDto forecastDto = new ForecastDto();
		forecastDto.setCode(forecast.getCode());
		forecastDto.setDate(forecast.getDate());
		forecastDto.setHigh(forecast.getHigh());
		forecastDto.setLow(forecast.getLow());
		forecastDto.setDescription(forecast.getDescription());
		return forecastDto;
	}

	private WeatherDto mapWeatherToWeatherDto(Weather weather) {
		WeatherDto weatherDto = new WeatherDto();
		weatherDto.setCode(weather.getCode());
		weatherDto.setDate(weather.getDate());
		weatherDto.setDescription(weather.getDescription());
		weatherDto.setLastUpdateDateTime(weather.getLastUpdateDateTime());
		weatherDto.setTemperature(weather.getTemperature());
		List<ForecastDto> forecastDtos = new ArrayList<>();
		if (!weather.getForecasts().isEmpty()) {
			ForecastDto forecastDto = null;
			for (Forecast forecast : weather.getForecasts()) {
				forecastDto = mapForecastToForecastDto(forecast);
				forecastDtos.add(forecastDto);
			}
		}
		weatherDto.setForecasts(forecastDtos);
		return weatherDto;
	}

	public void saveBoard(NewBoardDto dto, String userId) {
		Board board = new Board();
		User user = userRepository.findOne(userId);
		if(!"".equals(dto.getId())){
			board.setId(dto.getId());
		}
		board.setUser(user);
		board.setDescription(dto.getDescription());
		Board savedBoard = boardRepository.save(board);
		for (String woeid : dto.getWoeids()) {
			Optional<Location> oldLocation = locationRepository.findByWoeid(woeid);
			if (oldLocation.isPresent()) {
				oldLocation.get().getBoards().add(savedBoard);
				locationRepository.save(oldLocation.get());
			} else {
				yahooService.findLocationAndWeatherByWoeid(savedBoard, woeid);
			}
		}
	}

	private LocationDto mapLocationToLocationDto(Location location) {
		LocationDto locationDto = new LocationDto();
		locationDto.setCity(location.getCity());
		locationDto.setCountry(location.getCountry());
		locationDto.setWoeid(location.getWoeid());
		Optional<Weather> weather = weatherRepository.findByWoeid(location.getWoeid());
		if(weather.isPresent()){
			locationDto.setWeather(mapWeatherToWeatherDto(weather.get()));
		}
		return locationDto;
	}

	public void deleteBoard(String id) {
		Board board = boardRepository.findOne(id);
		List<Location> locationsWithTheBoard = locationRepository.getByBoardsId(id);
		for (Location location : locationsWithTheBoard) {
			location.getBoards().removeIf(b->b.getId().equals(id));
		}
		boardRepository.delete(board);
	}

	public void deleteLocationFromBoard(String boardId, String woeid) {
		Optional<Location> oldLocation = locationRepository.findByWoeid(woeid);
		if(oldLocation.isPresent()){
			oldLocation.get().getBoards().removeIf(b->b.getId().equals(boardId));
			if(oldLocation.get().getBoards().isEmpty()){
				locationRepository.delete(oldLocation.get());
				Optional<Weather> weatherWithoutLocation = weatherRepository.findByWoeid(woeid);
				if(weatherWithoutLocation.isPresent()){
					weatherRepository.delete(weatherWithoutLocation.get());
				}
			}else{
				locationRepository.save(oldLocation.get());
			}
		}
	}

	public void updateWeatherInfo() {
		for (Location location : locationRepository.findAll()) {
			yahooService.findWeatherByWoeid(location);
		}
	}
}
