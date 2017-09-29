package com.weather.challenge;


import com.weather.challenge.dto.external.Place;
import com.weather.challenge.util.PlaceHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class WeatherApp {

    @Autowired
    private PlaceHelper placeHelper;

    public Map<String,Place> allPlacesMap = new HashMap<String, Place>();

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WeatherApp.class, args);
    }

    @PostConstruct
    public void initWoeidMap() {
        allPlacesMap = placeHelper.completeAllPlaces();
    }

}
