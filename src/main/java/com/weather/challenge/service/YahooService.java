package com.weather.challenge.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.dto.external.Condition;
import com.weather.challenge.dto.external.Forecast;
import com.weather.challenge.dto.external.Weather;

@Service
public class YahooService {

    Logger logger = LoggerFactory.getLogger(YahooService.class);

    private YahooWeatherService yahooWeatherService;
    
    public YahooService() throws Exception{
        yahooWeatherService = new YahooWeatherService();
    }

    public LocationDto findWeatherByWoeid(String woeid) {
    	LocationDto location = null;
        try {
        	logger.info("getForecast for "+woeid);
            Channel channel = yahooWeatherService.getForecast(woeid, DegreeUnit.CELSIUS);
            logger.info("Response: " + channel);
            location = new LocationDto();
            location.setCity(channel.getLocation().getCity());
            location.setCountry(channel.getLocation().getCountry());
            location.setWoeid(woeid);
            location.setWeather(getWeather(channel));
        } catch (Exception e) {
            logger.error("Error consuming YahooWeatherService");
            logger.error(e.getMessage());
        }
        return location;
    }

	private Weather getWeather(Channel channel) {
		Weather weather = new Weather();
        weather.setCondition(new Condition(channel.getItem().getCondition().getText(), channel.getItem().getCondition().getTemp(), parseDate(channel.getItem().getCondition().getDate().toString()), channel.getItem().getCondition().getCode()));
        List<Forecast> forecastsRet = new ArrayList<Forecast>();
        List<com.github.fedy2.weather.data.Forecast> forecasts = channel.getItem().getForecasts().stream().limit(4).collect(Collectors.toList());
        for (com.github.fedy2.weather.data.Forecast f : forecasts) {
            forecastsRet.add(new Forecast(parseDate(f.getDate().toString()),f.getLow(),f.getHigh(),f.getText(),f.getCode()));
        }
        weather.setForecasts(forecastsRet);
		return weather;
	}

	private String parseDate(String date) {
		SimpleDateFormat formatnow = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ yyyy", Locale.ENGLISH); 
		SimpleDateFormat formatneeded=new SimpleDateFormat("EEE d MMM",Locale.US);
		try {
			Date date1 = formatnow.parse(date);
			String date2 = formatneeded.format(date1);
			return date2.toUpperCase();
		} catch (ParseException e) {
			logger.error(e.getMessage());
			return "";
		}
		
	}

}
