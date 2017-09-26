package com.weather.challenge.repository;

import org.springframework.data.repository.CrudRepository;

import com.weather.challenge.entity.Location;

public interface LocationRepository extends CrudRepository<Location,String>{
}
