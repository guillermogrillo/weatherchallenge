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
import com.weather.challenge.exception.ExistingUserException;
import com.weather.challenge.exception.InvalidPasswordException;
import com.weather.challenge.exception.UnexistingUserException;
import com.weather.challenge.service.UserService;
import com.weather.challenge.service.WeatherService;
import com.weather.challenge.service.YahooService;
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
	
	@PostMapping("/register")
	public ResponseEntity<String> register(@RequestBody UserLoginDto dto) throws ExistingUserException {
		userService.register(dto);
		String response = createResponse(WeatherServiceCode.OK);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody UserLoginDto dto) throws UnexistingUserException, InvalidPasswordException {
		UserDto userDto = userService.login(dto);
		String response = createResponse(WeatherServiceCode.OK, userDto);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@GetMapping("/{userId}/boards")
	public ResponseEntity<String> getBoards(@PathVariable final String userId) {
		logger.info("getBoards request for user " + userId);
		UserDto user = userService.getUser(userId);
		List<BoardDto> boards = weatherService.getBoards(user);
		String response = createResponse(WeatherServiceCode.OK, boards);
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
	public ResponseEntity<String> deleteBoard(@PathVariable String userId, @PathVariable String boardId) {
		logger.info("deleteBoard with id " + boardId);
		weatherService.deleteBoard(boardId);
		String response = createResponse(WeatherServiceCode.OK);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	@DeleteMapping("/{userId}/boards/{boardId}/{woeid}")
	public ResponseEntity<String> deleteLocationFromBoard(@PathVariable String userId, @PathVariable String boardId, @PathVariable String woeid){
		logger.info("delete location "+woeid+" from board " + boardId);
		weatherService.deleteLocationFromBoard(boardId,woeid);
		String response = createResponse(WeatherServiceCode.OK);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

	
	/**
	 * Manejo de excepciones
	 */

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
	
	@ExceptionHandler(InvalidPasswordException.class)
	public ResponseEntity<String> exceptionHandlerInvalidPassword(Exception e) {
		logger.error(e.getMessage());
		String response = createResponse(WeatherServiceCode.INVALID_PASSWORD);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> exceptionHandlerGeneric(Exception e) {
		logger.error(e.getMessage(), e);
		String response = createResponse(WeatherServiceCode.SERVER_ERROR);
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}
