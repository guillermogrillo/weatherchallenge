package com.weather.challenge.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class WeatherUpdateScheduller {
	
	Logger logger = LoggerFactory.getLogger(WeatherUpdateScheduller.class);
	
	@Autowired
	private WeatherService weatherService;
	
    @Scheduled(fixedRate = 60000)
    public void reportCurrentTime() {
    	logger.info("Updating weather info");
		weatherService.updateWeatherInfo();
		logger.info("Finished updating weather info");
    }
}
