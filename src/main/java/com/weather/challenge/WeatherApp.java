package com.weather.challenge;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WeatherApp {
	
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WeatherApp.class, args);
    }
    
    

}
