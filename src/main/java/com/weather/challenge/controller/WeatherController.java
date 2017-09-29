package com.weather.challenge.controller;

import java.util.List;

import com.weather.challenge.dto.external.Place;
import com.weather.challenge.dto.external.Weather;
import com.weather.challenge.service.YahooService;
import com.weather.challenge.util.PlaceHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.LocationDto;
import com.weather.challenge.dto.NewBoardDto;
import com.weather.challenge.dto.UserDto;
import com.weather.challenge.dto.UserLoginDto;
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

    @Autowired
    private PlaceHelper placeHelper;

    @PostMapping("/register")
    public void saveUser(UserLoginDto dto) {
        userService.saveUser(dto);
    }
    
    @PostMapping("/login")
    public UserLoginDto getUser(UserLoginDto dto) {
        return userService.getUserByUsername(dto.getUsername());
    }
    
    /*
     * Boards
     */

    @GetMapping("/{userId}/boards")
    public List<BoardDto> getBoards(@PathVariable final String userId) {
        logger.info("getBoards request for user " + userId);
        UserDto user = userService.getUser(userId);
        return weatherService.getBoards(user);
    }

    @GetMapping("/{userId}/boards/{boardId}")
    public BoardDto getBoard(@PathVariable String userId, @PathVariable String boardId) {
        logger.info("getBoard request for id" + boardId);
        return weatherService.getBoard(boardId);
    }

    @PostMapping("/{userId}/boards")
    public void saveBoard(@RequestBody NewBoardDto dto, @PathVariable String userId) {
        logger.info("saveBoard " + dto.getDescription());
        weatherService.saveBoard(dto, userId);
    }

    @DeleteMapping("/{userId}/boards/{boardId}")
    public void deleteBoard(@PathVariable String boardId) {
        logger.info("deleteBoard with id " + boardId);
        weatherService.deleteBoard(boardId);
    }
    
    /**
     * Yahoo Service
     */

    @GetMapping("/getWeather/{woeid}")
    public Weather getWeatherByWoeid(@PathVariable  String woeid) {
        Weather weather = yahooService.findWeatherByWoeid(new String(woeid));
        return weather;
    }

    @GetMapping("/getLocationByName/{location}")
    public List<Place> getLocationsByName(@PathVariable String location) {
        return placeHelper.getPlacesByName(location);
    }
    
    @GetMapping("/getLocationByWoeid/{woeid}")
    public Place getLocationByWoeid(@PathVariable String woeid) {
        return placeHelper.getPlaceByWoeid(woeid);
    }



}
