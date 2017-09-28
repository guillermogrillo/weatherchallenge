package com.weather.challenge.service;

import com.weather.challenge.dto.external.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URLEncoder;

@Service
public class YahooService {

    public Weather findWeatherByWoeid(int woeid) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("https://query.yahooapis.com/v1/public/yql?q=select%20item.condition%20from%20weather.forecast%20where%20woeid%20%3D%202487889&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys", Weather.class);
    }

}
