package com.weather.challenge.repository;

import com.weather.challenge.entity.Board;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BoardRepository extends MongoRepository<Board,String> {

    List<Board> getByUserId(String id);

}
