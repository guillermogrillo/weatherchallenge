package com.weather.challenge.controller;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.entity.Location;
import com.weather.challenge.entity.User;
import com.weather.challenge.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.weather.challenge.service.WeatherService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WeatherController {

    Logger logger = LoggerFactory.getLogger(WeatherController.class);

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private UserService userService;

    @GetMapping("/boards")
    public List<BoardDto> getBoards(@RequestParam final String userId) {
        logger.info("getBoards request for user %s",userId);
        User user = userService.getUser(userId);
        return weatherService.getBoards(user);
    }

    @GetMapping("/board/{id}")
    public BoardDto getBoard(@PathVariable String id) {
        logger.info("getBoard request for id %s",id);
        return weatherService.getBoard(id);
    }

    @PostMapping("/board")
    public void saveBoard(BoardDto dto) {
        logger.info("saveBoard %s",dto.getDescription());
        weatherService.saveBoard(dto);
    }

    @DeleteMapping("/board")
    public void deleteBoard(BoardDto dto) {
        logger.info("deleteBoard with id: %s",dto.getId());
        weatherService.deleteBoard(dto);
    }

    @GetMapping("/board/{boardId}/locations")
    public List<LocationDto> getBoardLocations(@PathVariable String boardId) {
        logger.info("getBoardLocations for boardId: %s",boardId);
        return weatherService.getLocations(boardId);
    }

    @PostMapping("board/{boardId}/location")
    public void saveLocation(LocationDto dto, @PathVariable String boardId) {
        logger.info("saveLocation %s in board %s",dto.getDescription(), boardId);
        weatherService.saveLocation(dto,boardId);
    }

    @DeleteMapping("board/{boardId}/location")
    public void deleteLocation(LocationDto dto, @PathVariable String boardId) {
        logger.info("deleteLocation %s in board %s",dto.getDescription(),boardId);
        weatherService.deleteLocation(dto);
    }


}
