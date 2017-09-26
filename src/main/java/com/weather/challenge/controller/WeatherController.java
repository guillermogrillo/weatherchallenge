package com.weather.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.challenge.entity.Board;
import com.weather.challenge.service.WeatherService;

@RestController
@RequestMapping("/weather")
public class WeatherController {
	
	private WeatherService weatherService;
	
	@Autowired
	public WeatherController(WeatherService weatherService) {
		this.weatherService = weatherService;
	}

	@GetMapping(value = "/boards")
	public Board getBoard() {
		return weatherService.getBoard("1");
	}

	@GetMapping(value = "/boards/{id}")
	public Iterable<Board> getBoard(@PathVariable String id) {
		return weatherService.getBoards("asd");
	}

	@PostMapping(value = "/board")
	public void saveBoard() {
		weatherService.saveBoard();
	}

	@DeleteMapping(value = "/board")
	public void deleteBoard() {
		weatherService.deleteBoard();
	}

}
