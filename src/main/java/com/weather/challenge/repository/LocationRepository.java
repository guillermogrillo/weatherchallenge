package com.weather.challenge.repository;

import com.weather.challenge.entity.Location;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LocationRepository extends MongoRepository<Location, String> {
    List<Location> getByBoardId(String boardId);
}
