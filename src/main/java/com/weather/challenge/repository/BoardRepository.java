package com.weather.challenge.repository;

import com.weather.challenge.entity.Board;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by yoga on 26/09/17.
 */
public interface BoardRepository extends MongoRepository<Board,String> {
}
