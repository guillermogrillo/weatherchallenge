package com.weather.challenge.controller;

import java.util.List;

import com.weather.challenge.dto.external.Weather;
import com.weather.challenge.service.YahooService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.dto.UserDto;
import com.weather.challenge.entity.User;
import com.weather.challenge.service.UserService;
import com.weather.challenge.service.WeatherService;
import springfox.documentation.builders.PathSelectors;

/**
 * 	[GET] 		/{userId}/boards -> Trae todos los boards del usuario cuyo id es {userId}
	[GET] 		/{userId}/boards/{boardId} -> Trae el detalle del board cuyo id es {boardId}
	[POST]		/{userId}/boards/ -> Agrega el nuevo board en base al dto que llega
	[DELETE]	/{userId}/boards/{boardId} -> Borra el board cuyo id es {boardId}
	[GET]		/{userId}/boards/{boardId}/locations/ -> Trae las locaciones del board cuyo id es {boardId}
	[POST]		/{userId}/boards/{boardId}/locations/ -> Agrega la locacion en base al dto que llega
	[DELETE]	/{userId}/boards/{boardId}/locations/{locationId} -> Borra la locacion cuyo id es {locationId} 
 *
 */

@RestController
@RequestMapping("/api")
public class WeatherController {

    Logger logger = LoggerFactory.getLogger(WeatherController.class);

    @Autowired
    private WeatherService weatherService;

    @Autowired
    private UserService userService;

    @Autowired
    private YahooService yahooService;

    @PostMapping("/user")
    public void saveUser(UserDto dto) {
        userService.saveUser(dto);
    }
    
    /*
     * Boards
     */

    @GetMapping("/{userId}/boards")
    public List<BoardDto> getBoards(@PathVariable final String userId) {
        logger.info("getBoards request for user " + userId);
        User user = userService.getUser(userId);
        return weatherService.getBoards(user);
    }

    @GetMapping("/{userId}/boards/{boardId}")
    public BoardDto getBoard(@PathVariable String userId, @PathVariable String boardId) {
        logger.info("getBoard request for id" + boardId);
        return weatherService.getBoard(boardId);
    }

    @PostMapping("/{userId}/boards")
    public void saveBoard(@RequestBody BoardDto dto, @PathVariable String userId) {
        logger.info("saveBoard " + dto.getDescription());
        weatherService.saveBoard(dto, userId);
    }

    @DeleteMapping("/{userId}/boards/{boardId}")
    public void deleteBoard(@PathVariable String boardId) {
        logger.info("deleteBoard with id " + boardId);
        weatherService.deleteBoard(boardId);
    }
    
    /*
     * Locations
     */

    @GetMapping("{userId}/boards/{boardId}/locations")
    public List<LocationDto> getBoardLocations(@PathVariable String userId, @PathVariable String boardId) {
        logger.info("getBoardLocations for boardId " + boardId);
        return weatherService.getLocations(boardId);
    }

    @PostMapping("{userId}/boards/{boardId}/locations")
    public void saveLocation(@RequestBody LocationDto dto, @PathVariable String userId, @PathVariable String boardId) {
        logger.info("saveLocation" + dto.getDescription() + " in board " + boardId);
        weatherService.saveLocation(dto,boardId);
    }

    @DeleteMapping("{userId}/boards/{boardId}/locations")
    public void deleteLocation(@RequestBody LocationDto dto, @PathVariable String userId, @PathVariable String boardId) {
        logger.info("deleteLocation "+dto.getDescription()+" in board ",boardId);
        weatherService.deleteLocation(dto);
    }

    /**
     * Yahoo Service
     */

    @GetMapping("/getWeather/{woeid}")
    public Weather getWeatherByWoeid(@PathVariable  String woeid) {
        Weather weather = yahooService.findWeatherByWoeid(new String(woeid));
        return weather;
    }



}
