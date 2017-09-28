package com.weather.challenge.service;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weather.challenge.dto.external.Forecast;
import com.weather.challenge.dto.external.Item;
import com.weather.challenge.dto.external.Weather;

@Service
public class YahooService {

    public Weather findWeatherByWoeid(int woeid) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        String url = "https://query.yahooapis.com/v1/public/yql?q=select item from weather.forecast where woeid="+woeid+"&u=c";
        try{
        	ResponseEntity<String> exchange = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        	String resp = exchange.getBody();
        	ObjectMapper o = new ObjectMapper();
        	Item item = o.readValue(resp, Item.class);
        	for (Forecast forecast : item.getForecasts()) {
				System.out.println("Fecha:"+forecast.getDate());
				System.out.println("Min:"+forecast.getLow());
				System.out.println("Max:"+forecast.getHigh());
				System.out.println("Estado:"+forecast.getText());
			}
        	System.out.println(item.getTitle());
        }catch(Exception e){
        	System.out.println(e.getMessage());
        }
        return null;
    }

}
