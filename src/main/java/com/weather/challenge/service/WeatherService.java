package com.weather.challenge.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.dto.UserDto;
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

    @Autowired
    private UserRepository userRepository;


    public List<BoardDto> getBoards(User user) {
        List<Board> boards = boardRepository.getByUserId(user.getId());
        List<BoardDto> retBoards = new ArrayList<BoardDto>();
        if (!boards.isEmpty()) {
            BoardDto boardDto = null;
            for (Board board : boards) {
                boardDto = new BoardDto();
                boardDto.setDescription(board.getDescription());
                boardDto.setUser(mapUserToUserDto(board.getUser()));
                retBoards.add(boardDto);
            }
        }
        return retBoards;
    }

    public BoardDto getBoard(String id) {
        Board board = boardRepository.findOne(id);
        BoardDto boardDto = new BoardDto();
        boardDto.setDescription(board.getDescription());
        boardDto.setId(board.getId());
        boardDto.setUser(mapUserToUserDto(board.getUser()));
        return boardDto;
    }

    public void saveBoard(BoardDto dto, String userId) {
        Board board = new Board();
        User user = userRepository.findOne(userId);
        board.setDescription(dto.getDescription());
        board.setUser(user);
        boardRepository.save(board);
    }

    public void deleteBoard(BoardDto dto) {
        boardRepository.delete(dto.getId());
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
            LocationDto locationDto = null;
            for (Location location : locations) {
                retLocations.add(mapLocationToLocationDto(location));
            }
        }
        return retLocations;
    }

    private UserDto mapUserToUserDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setUsername(user.getUsername());
        dto.setPassword(user.getPassword());
        return dto;
    }

    private User mapUserDtoToUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(userDto.getPassword());
        return user;
    }

    private BoardDto mapBoardToBoardDto(Board board) {
        BoardDto boardDto = new BoardDto();
        boardDto.setId(board.getId());
        boardDto.setDescription(board.getDescription());
        boardDto.setUser(mapUserToUserDto(board.getUser()));
        return boardDto;
    }

    private Board mapBoardDtoToBoard(BoardDto boardDto) {
        Board board = new Board();
        board.setId(boardDto.getId());
        board.setDescription(boardDto.getDescription());
        board.setUser(mapUserDtoToUser(boardDto.getUser()));
        return board;
    }

    private LocationDto mapLocationToLocationDto(Location location) {
        LocationDto locationDto = new LocationDto();
        locationDto.setId(location.getId());
        locationDto.setDescription(location.getDescription());
        locationDto.setBoard(mapBoardToBoardDto(location.getBoard()));
        return locationDto;
    }

    private Location mapLocationDtoToLocation(LocationDto locationDto) {
        Location location = new Location();
        location.setId(locationDto.getId());
        location.setDescription(locationDto.getDescription());
        location.setBoard(mapBoardDtoToBoard(locationDto.getBoard()));
        return location;
    }

}
