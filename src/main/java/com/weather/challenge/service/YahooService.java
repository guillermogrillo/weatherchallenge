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

    public Weather findWeatherByWoeid(String woeid) {
        Weather weather = null;
        try {
            Channel channel = yahooWeatherService.getForecast(woeid, DegreeUnit.CELSIUS);
            weather = new Weather();
            weather.setDescription(channel.getLocation().getCity() + "," + channel.getLocation().getCountry()+"("+woeid+")");
            weather.setCondition(new Condition(channel.getItem().getCondition().getText(), channel.getItem().getCondition().getTemp(), parseDate(channel.getItem().getCondition().getDate().toString()), channel.getItem().getCondition().getCode()));
            List<Forecast> forecasts = new ArrayList<Forecast>();
            for (com.github.fedy2.weather.data.Forecast f : channel.getItem().getForecasts()) {
                forecasts.add(new Forecast(parseDate(f.getDate().toString()),f.getLow(),f.getHigh(),f.getText(),f.getCode()));
            }
            weather.setForecasts(forecasts.stream().limit(4).collect(Collectors.toList()));
        } catch (Exception e) {
            logger.error("Error consuming YahooWeatherService");
            logger.error(e.getMessage());
        }
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
