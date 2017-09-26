package com.weather.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.weather.challenge.entity.Board;
import com.weather.challenge.entity.Location;
import com.weather.challenge.repository.BoardRepository;
import com.weather.challenge.repository.LocationRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class WeatherService implements BoardService,LocationService{

    @Autowired
    private BoardRepository boardRepo;

    @Autowired
    private LocationRepository locationRepo;


    @Override
    public void saveLocation() {
        Location location = new Location();
        location.setId("123");
        location.setDescription("Descripcion");
        locationRepo.save(location);
    }

    @Override
    public void deleteLocation() {
        locationRepo.delete("123");
    }

    @Override
    public Board getBoard(String id) {
        return boardRepo.findOne("1");
    }

    @Override
    public Iterable<Board> getBoards(String user) {
        Iterable<Board> boards = boardRepo.findAll();
        return boards;
    }

    @Override
    public void saveBoard() {
        Board board = new Board();
        board.setId("1");
        board.setDescription("board 1");
        board.setLocations(new ArrayList<Location>());
        boardRepo.save(board);
    }

    @Override
    public void deleteBoard() {
        boardRepo.delete("1");
    }
}
