package com.weather.challenge.service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import com.weather.challenge.dto.external.Atmosphere;
import com.weather.challenge.dto.external.Condition;
import com.weather.challenge.dto.external.Forecast;
import com.weather.challenge.dto.external.Place;
import com.weather.challenge.dto.external.Wind;
import com.weather.challenge.util.PlaceHelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.challenge.dto.external.Weather;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class YahooService {

    Logger logger = LoggerFactory.getLogger(YahooService.class);

    private YahooWeatherService yahooWeatherService;
    
    private DateFormat dfOriginal = new SimpleDateFormat("ddMMyyyy", Locale.US);
    private DateFormat dfParsed = new SimpleDateFormat("EEE d MMM ", Locale.US);
    
    @Autowired
    private PlaceHelper placeHelper;

    public YahooService() throws Exception{
        yahooWeatherService = new YahooWeatherService();
    }

    public Weather findWeatherByWoeid(String woeid) {
        Weather weather = null;
        try {
            Channel channel = yahooWeatherService.getForecast(woeid, DegreeUnit.CELSIUS);
            Place placeByWoeid = placeHelper.getPlaceByWoeid(woeid);
            weather = new Weather();
            weather.setWind(new Wind(channel.getWind().getChill(), channel.getWind().getDirection(), channel.getWind().getSpeed()));
            weather.setAtmosphere(new Atmosphere(channel.getAtmosphere().getHumidity(),
                    channel.getAtmosphere().getVisibility(),
                    channel.getAtmosphere().getPressure(),
                    Atmosphere.PressureState.valueOf(channel.getAtmosphere().getRising().name())));
            weather.setDescription(placeByWoeid.getName() + "," + placeByWoeid.getCountryShortName());
            weather.setCondition(new Condition(channel.getItem().getCondition().getText(),
                    channel.getItem().getCondition().getTemp(),
                    channel.getItem().getCondition().getDate()));
            List<Forecast> forecasts = new ArrayList<Forecast>();
            for (com.github.fedy2.weather.data.Forecast f : channel.getItem().getForecasts()) {
                forecasts.add(new Forecast(parseDate(f.getDate().toString()),f.getLow(),f.getHigh(),f.getText()));
            }
            weather.setForecasts(forecasts.stream().limit(3).collect(Collectors.toList()));
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
