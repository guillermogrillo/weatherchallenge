package com.weather.challenge.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.entity.Board;
import com.weather.challenge.entity.Location;
import com.weather.challenge.entity.User;
import com.weather.challenge.repository.BoardRepository;
import com.weather.challenge.repository.LocationRepository;
import com.weather.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private LocationRepository locationRepository;


    public List<BoardDto> getBoards(User user) {
        List<Board> boards = boardRepository.getByUserId(user.getId());
        List<BoardDto> retBoards = new ArrayList<BoardDto>();
        if (!boards.isEmpty()) {
            for (Board board : boards) {
                retBoards.add(new BoardDto(board));
            }
        }
        return retBoards;
    }

    public BoardDto getBoard(String id) {
        Board board = boardRepository.findOne(id);
        return new BoardDto(board);
    }

    public void saveBoard(BoardDto dto) {
        Board board = new Board(dto);
        boardRepository.save(board);
    }

    public void deleteBoard(BoardDto dto) {
        boardRepository.delete(dto.getId());
    }

    public void saveLocation(LocationDto dto, String boardId) {
        Board board = boardRepository.findOne(boardId);
        Location location = new Location(dto, board);
        locationRepository.save(location);
    }

    public void deleteLocation(LocationDto dto) {
        locationRepository.delete(dto.getId());
    }

    public List<LocationDto> getLocations(String boardId) {
        List<Location> locations = locationRepository.getByBoardId(boardId);
        List<LocationDto> retLocations = new ArrayList<LocationDto>();
        for (Location location : locations) {
            retLocations.add(new LocationDto(location));
        }
        return retLocations;
    }

}
