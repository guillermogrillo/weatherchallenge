package com.weather.challenge.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.entity.Board;
import com.weather.challenge.entity.Location;
import com.weather.challenge.entity.User;
import com.weather.challenge.mapper.BoardMapper;
import com.weather.challenge.mapper.LocationMapper;
import com.weather.challenge.mapper.UserMapper;
import com.weather.challenge.repository.BoardRepository;
import com.weather.challenge.repository.LocationRepository;
import com.weather.challenge.repository.UserRepository;

@Service
public class WeatherService {

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private BoardMapper boardMapper;
    
    @Autowired
    private LocationMapper locationMapper;


    public List<BoardDto> getBoards(User user) {
        List<Board> boards = boardRepository.getByUserId(user.getId());
        List<BoardDto> retBoards = new ArrayList<BoardDto>();
        if (!boards.isEmpty()) {
            BoardDto boardDto = null;
            for (Board board : boards) {
                boardDto = new BoardDto();
                boardDto.setDescription(board.getDescription());
                boardDto.setUser(userMapper.entityToDto(board.getUser()));
                retBoards.add(boardDto);
            }
        }
        return retBoards;
    }

    public BoardDto getBoard(String id) {
        Board board = boardRepository.findOne(id);
        BoardDto boardDto = new BoardDto();
        boardDto.setDescription(board.getDescription());
        boardDto.setUser(userMapper.entityToDto(board.getUser()));
        return boardDto;
    }

    public void saveBoard(BoardDto dto, String userId) {
        Board board = new Board();
        User user = userRepository.findOne(userId);
        board.setDescription(dto.getDescription());
        board.setUser(user);
        boardRepository.save(board);
    }

    public void deleteBoard(String id) {
        boardRepository.delete(id);
    }

    public void saveLocation(LocationDto dto, String boardId) {
        Board board = boardRepository.findOne(boardId);
        Location location = new Location();
        location.setDescription(dto.getDescription());
        location.setBoard(board);
        locationRepository.save(location);
    }

    public void deleteLocation(LocationDto dto) {
        locationRepository.delete(dto.getId());
    }

    public List<LocationDto> getLocations(String boardId) {
        List<Location> locations = locationRepository.getByBoardId(boardId);
        List<LocationDto> retLocations = new ArrayList<LocationDto>();
        if (!locations.isEmpty()) {
            for (Location location : locations) {
                retLocations.add(locationMapper.entityToDto(location));
            }
        }
        return retLocations;
    }

}
