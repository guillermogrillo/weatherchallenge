package com.weather.challenge.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.weather.challenge.entity.Weather;

public interface WeatherRepository extends MongoRepository<Weather,String> {

	Optional<Weather> findByWoeid(String woeid);

}
