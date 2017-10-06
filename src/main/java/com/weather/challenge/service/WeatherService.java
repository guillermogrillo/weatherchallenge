package com.weather.challenge.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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
			BoardDto boardDto = new BoardDto();
			for (Board board : boards) {
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
		/*
		if (!boards.isEmpty()) {
			BoardDto boardDto = null;
			for (Board board : boards) {
				boardDto = new BoardDto();
				boardDto.setId(board.getId());
				boardDto.setDescription(board.getDescription());
				List<LocationDto> locationDtos = new ArrayList<>();
				if (!board.getLocations().isEmpty()) {
					LocationDto locationDto = null;
					for (Location location : board.getLocations()) {
						locationDto = new LocationDto();
						locationDto.setCity(location.getCity());
						locationDto.setCountry(location.getCountry());
						locationDto.setWoeid(location.getWoeid());
						WeatherDto weatherDto = mapWeatherToWeatherDto(location.getWeather());
						locationDto.setWeather(weatherDto);
						locationDtos.add(locationDto);
					}
					boardDto.setLocations(locationDtos);
				}
			}
			retBoards.add(boardDto);
		}
		* 
		 */
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
		weatherDto.setWoeid(weather.getWoeid());
		weatherDto.setLastUpdateDateTime(weather.getLastUpdateDateTime());
		weatherDto.setTemperature(weather.getTemperature());
		List<ForecastDto> forecastDtos = new ArrayList<>();
		if (!weather.getForecasts().isEmpty()) {
			ForecastDto forecastDto = null;
			for (Forecast forecast : weather.getForecasts()) {
				mapForecastToForecastDto(forecast);
				forecastDtos.add(forecastDto);
			}
		}
		weatherDto.setForecasts(forecastDtos);
		return weatherDto;
	}

	public void saveBoard(NewBoardDto dto, String userId) {
		Board board = new Board();
		User user = userRepository.findOne(userId);
		board.setUser(user);
		board.setDescription(dto.getDescription());
		Board savedBoard = boardRepository.save(board);
		for (String woeid : dto.getWoeids()) {
			Optional<Location> oldLocation = locationRepository.findByWoeid(woeid);
			if (oldLocation.isPresent()) {
				oldLocation.get().getBoards().add(savedBoard);
			} else {
				yahooService.findLocationAndWeatherByWoeid(savedBoard, woeid);
			}
		}
	}

	private Weather mapWeatherDtoToWeather(WeatherDto weatherDto) {
		Weather weather = new Weather();
		weather.setCode(weatherDto.getCode());
		weather.setDate(weatherDto.getDate());
		weather.setDescription(weatherDto.getDescription());
		weather.setTemperature(weatherDto.getTemperature());
		weather.setWoeid(weatherDto.getWoeid());
		weather.setLastUpdateDateTime(weatherDto.getLastUpdateDateTime());
		List<Forecast> forecasts = new ArrayList<>();
		for (ForecastDto forecastDto : weatherDto.getForecasts()) {
			Forecast forecast = mapForecastDtoToForecast(forecastDto);
			forecasts.add(forecast);
		}
		weather.setForecasts(forecasts);
		return weather;
	}

	private Forecast mapForecastDtoToForecast(ForecastDto forecastDto) {
		Forecast forecast = new Forecast();
		forecast.setCode(forecastDto.getCode());
		forecast.setDate(forecastDto.getDate());
		forecast.setDescription(forecastDto.getDescription());
		forecast.setHigh(forecastDto.getHigh());
		forecast.setLow(forecastDto.getLow());
		return forecast;
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
		boardRepository.delete(id);
	}

	public void deleteLocationFromBoard(String boardId, String woeid) {
		Optional<Location> oldLocation = locationRepository.findByWoeid(woeid);
		if(oldLocation.isPresent()){
			oldLocation.get().getBoards().removeIf(b->b.getId().equals(boardId));
			locationRepository.save(oldLocation.get());
		}
	}

	public void updateWeatherInfo() {
		for (Location location : locationRepository.findAll()) {
			yahooService.findWeatherByWoeid(location);
		}
	}
}
