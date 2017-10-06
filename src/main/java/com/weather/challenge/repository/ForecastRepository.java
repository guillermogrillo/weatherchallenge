package com.weather.challenge.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.weather.challenge.entity.Forecast;

public interface ForecastRepository extends MongoRepository<Forecast,String> {


}
