package com.weather.challenge.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import com.weather.challenge.entity.Board;
import com.weather.challenge.entity.Location;
import com.weather.challenge.entity.Weather;
import com.weather.challenge.repository.LocationRepository;
import com.weather.challenge.repository.WeatherRepository;

@Service
public class YahooService {

	Logger logger = LoggerFactory.getLogger(YahooService.class);

	private YahooWeatherService yahooWeatherService;
	
	@Autowired
	private WeatherRepository weatherRepository;
	
	@Autowired
	private LocationRepository locationRepository;
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public YahooService() throws Exception {
		yahooWeatherService = new YahooWeatherService();
	}

	public Weather findWeatherByWoeid(Location location) {
		try {
			logger.info("getForecast for " + location.getWoeid());
			Channel channel = yahooWeatherService.getForecast(location.getWoeid(), DegreeUnit.CELSIUS);
			logger.info("Response: " + channel);
			Weather weather = getWeatherFromYahooService(channel, location);
			weatherRepository.save(weather);
			return weather;
		} catch (Exception e) {
			logger.error("Error consuming YahooWeatherService");
			logger.error(e.getMessage());
			throw new RuntimeException("Could not get the updated weather for woeid=" + location.getWoeid());
		}
	}

	private Weather getWeatherFromYahooService(Channel channel, Location location) {
		Weather weather = buildWeather(channel, location);
		return weather;
	}

	private Weather buildWeather(Channel channel, Location location) {
		Weather weather = new Weather();
		weather.setCode(channel.getItem().getCondition().getCode());
		weather.setDate(parseDate(channel.getItem().getCondition().getDate().toString()));
		weather.setDescription(channel.getItem().getCondition().getText());
		weather.setTemperature(channel.getItem().getCondition().getTemp());
		weather.setWoeid(location.getWoeid());
		weather.setLastUpdateDateTime(LocalDateTime.now().format(formatter).toString());
		List<com.github.fedy2.weather.data.Forecast> forecasts = channel.getItem().getForecasts().stream().limit(4)
				.collect(Collectors.toList());
		List<com.weather.challenge.entity.Forecast> forecastList = new ArrayList<>();
		for (com.github.fedy2.weather.data.Forecast forecast : forecasts) {
			com.weather.challenge.entity.Forecast f = new com.weather.challenge.entity.Forecast();
			f.setCode(forecast.getCode());
			f.setDate(parseDate(forecast.getDate().toString()));
			f.setDescription(forecast.getText());
			f.setHigh(forecast.getHigh());
			f.setLow(forecast.getLow());
			forecastList.add(f);
		}
		weather.setForecasts(forecastList);
		weather.setLocation(location);
		return weather;
	}

	private String parseDate(String date) {
		SimpleDateFormat formatnow = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ yyyy", Locale.ENGLISH);
		SimpleDateFormat formatneeded = new SimpleDateFormat("EEE d MMM", Locale.US);
		try {
			Date date1 = formatnow.parse(date);
			String date2 = formatneeded.format(date1);
			return date2.toUpperCase();
		} catch (ParseException e) {
			logger.error(e.getMessage());
			return "";
		}

	}

	public Location findLocationAndWeatherByWoeid(Board board, String woeid) {
		try {
			logger.info("getForecast for " + woeid);
			Channel channel = yahooWeatherService.getForecast(woeid, DegreeUnit.CELSIUS);
			logger.info("Response: " + channel);
			Location location = new Location();
			location.setCity(channel.getLocation().getCity());
			location.setCountry(channel.getLocation().getCountry());
			location.setWoeid(woeid);
			location.getBoards().add(board);
			Location savedLocation = locationRepository.save(location);
			Weather weather = buildWeather(channel, savedLocation);
			weather.setLocation(savedLocation);
			weatherRepository.save(weather);
			return location;
		} catch (Exception e) {
			logger.error("Error consuming YahooWeatherService");
			logger.error(e.getMessage());
			throw new RuntimeException("Could not get the updated location and weather for woeid=" + woeid);
		}
	}

}
