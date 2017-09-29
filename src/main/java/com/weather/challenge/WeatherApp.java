package com.weather.challenge;


import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.weather.challenge.dto.external.Place;

@SpringBootApplication
public class WeatherApp {

    public Map<String,Place> allPlacesMap = new HashMap<String, Place>();

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WeatherApp.class, args);
    }

}
