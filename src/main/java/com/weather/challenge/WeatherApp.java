package com.weather.challenge;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class WeatherApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WeatherApp.class, args);
    }

}
