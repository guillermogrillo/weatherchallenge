package com.weather.challenge.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.challenge.dto.BoardDto;
import com.weather.challenge.dto.NewBoardDto;
import com.weather.challenge.dto.UserDto;
import com.weather.challenge.dto.UserLoginDto;
import com.weather.challenge.dto.external.Place;
import com.weather.challenge.dto.external.Weather;
import com.weather.challenge.exception.ExistingUserException;
import com.weather.challenge.exception.UnexistingUserException;
import com.weather.challenge.service.UserService;
import com.weather.challenge.service.WeatherService;
import com.weather.challenge.service.YahooService;
import com.weather.challenge.util.PlaceHelper;
import com.weather.challenge.util.WeatherServiceCode;

@RestController
@RequestMapping("/api")
public class WeatherController extends GenericController {

	Logger logger = LoggerFactory.getLogger(WeatherController.class);

	@Autowired
	private WeatherService weatherService;

	@Autowired
	private UserService userService;

	@Autowired
	private YahooService yahooService;

	@Autowired
	private PlaceHelper placeHelper;

	// @Autowired
	// private SimpMessagingTemplate brokerMessagingTemplate;

	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody UserLoginDto dto) throws ExistingUserException {
		userService.saveUser(dto);
		String response = createResponse(WeatherServiceCode.OK);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserLoginDto dto) throws UnexistingUserException {
		UserDto userDto = userService.getUserByUsernameAndPassword(dto.getUsername(),dto.getPassword());
		String response = createResponse(WeatherServiceCode.OK, userDto);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	/*
	 * Boards
	 */

	@GetMapping("/{userId}/boards")
	public ResponseEntity<String> getBoards(@PathVariable final String userId) {
		logger.info("getBoards request for user " + userId);
		UserDto user = userService.getUser(userId);
		List<BoardDto> boards = weatherService.getBoards(user);
		String response = createResponse(WeatherServiceCode.OK, boards);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping("/{userId}/boards/{boardId}")
	public ResponseEntity<String> getBoard(@PathVariable String userId, @PathVariable String boardId) {
		logger.info("getBoard request for id" + boardId);
		BoardDto board = weatherService.getBoard(boardId);
		String response = createResponse(WeatherServiceCode.OK, board);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PostMapping("/{userId}/boards")
	public ResponseEntity<String> saveBoard(@RequestBody NewBoardDto dto, @PathVariable String userId) {
		logger.info("saveBoard " + dto.getDescription());
		weatherService.saveBoard(dto, userId);
		String response = createResponse(WeatherServiceCode.OK);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@DeleteMapping("/{userId}/boards/{boardId}")
	public ResponseEntity<String> deleteBoard(@PathVariable String boardId) {
		logger.info("deleteBoard with id " + boardId);
		weatherService.deleteBoard(boardId);
		String response = createResponse(WeatherServiceCode.OK);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	/**
	 * Yahoo Service
	 */

	@GetMapping("/getWeather/{woeid}")
	public ResponseEntity<String> getWeatherByWoeid(@PathVariable String woeid) {
		Weather weather = yahooService.findWeatherByWoeid(new String(woeid));
		String response = createResponse(WeatherServiceCode.OK, weather);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping("/getLocationByName/{location}")
	public ResponseEntity<String> getLocationsByName(@PathVariable String location) {
		List<Place> places = placeHelper.getPlacesByName(location);
		String response = createResponse(WeatherServiceCode.OK, places);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@GetMapping("/getLocationByWoeid/{woeid}")
	public ResponseEntity<String> getLocationByWoeid(@PathVariable String woeid) {
		Place place = placeHelper.getPlaceByWoeid(woeid);
		String response = createResponse(WeatherServiceCode.OK, place);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	/**
	 * Servicio para pollear data
	 */

	// @Scheduled(fixedRate = 600000)
	// public void getWeatherNews(String userId) throws Exception {
	// UserDataDto userData = weatherService.getWeatherNews(userId);
	// brokerMessagingTemplate.convertAndSend("/topic/weather", userData);
	// }

	@ExceptionHandler(ExistingUserException.class)
	public ResponseEntity<String> exceptionHandlerExistingUser(Exception e) {
		logger.error(e.getMessage());
		String response = createResponse(WeatherServiceCode.EXISTING_USER);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@ExceptionHandler(UnexistingUserException.class)
	public ResponseEntity<String> exceptionHandlerUnexistingUser(Exception e) {
		logger.error(e.getMessage());
		String response = createResponse(WeatherServiceCode.UNEXISTING_USER);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandlerGeneric(Exception e) {
		logger.error(e.getMessage(), e);
		String response = createResponse(WeatherServiceCode.SERVER_ERROR);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
