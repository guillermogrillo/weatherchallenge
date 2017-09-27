package com.weather.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weather.challenge.service.WeatherService;

@RestController
@RequestMapping("/api")
public class WeatherController {

	@Autowired
	private WeatherService service;
	
	@GetMapping
	public String saludar(){
		return "hola";
	}

}
