package com.weather.challenge.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.weather.challenge.entity.Location;

public interface LocationRepository extends MongoRepository<Location,String> {

	Optional<Location> findByWoeid(String woeid);

	List<Location> getByBoardsId(String id);

}
