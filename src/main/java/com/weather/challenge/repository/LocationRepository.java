package com.weather.challenge.repository;

import com.weather.challenge.entity.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location,String>{
}
