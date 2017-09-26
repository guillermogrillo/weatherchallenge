package com.weather.challenge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.weather.challenge.controller.WeatherController;


@SpringBootApplication
public class WeatherApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WeatherController.class, args);
    }


}
