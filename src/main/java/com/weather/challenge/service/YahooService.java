package com.weather.challenge.service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;
import com.weather.challenge.dto.external.Atmosphere;
import com.weather.challenge.dto.external.Condition;
import com.weather.challenge.dto.external.Forecast;
import com.weather.challenge.dto.external.Wind;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.challenge.dto.external.Weather;

import java.util.ArrayList;
import java.util.List;

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
            weather.setWind(new Wind(channel.getWind().getChill(), channel.getWind().getDirection(), channel.getWind().getSpeed()));
            weather.setAtmosphere(new Atmosphere(channel.getAtmosphere().getHumidity(),
                    channel.getAtmosphere().getVisibility(),
                    channel.getAtmosphere().getPressure(),
                    Atmosphere.PressureState.valueOf(channel.getAtmosphere().getRising().name())));
            weather.setDescription(channel.getDescription());
            weather.setCondition(new Condition(channel.getItem().getCondition().getText(),
                    channel.getItem().getCondition().getTemp(),
                    channel.getItem().getCondition().getDate()));
            List<Forecast> forecasts = new ArrayList<Forecast>();
            for (com.github.fedy2.weather.data.Forecast f : channel.getItem().getForecasts()) {
                forecasts.add(new Forecast(f.getDate(),f.getLow(),f.getHigh(),f.getText()));
            }
            weather.setForecasts(forecasts);
        } catch (Exception e) {
            logger.error("Error consuming YahooWeatherService");
            logger.error(e.getMessage());
        }
        return weather;
    }

}
