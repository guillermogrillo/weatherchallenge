package com.weather.challenge.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.weather.challenge.util.BaseResponse;
import com.weather.challenge.util.WeatherServiceCode;

public class GenericController {
	
	private Logger logger = LoggerFactory.getLogger(GenericController.class);

	public <T> String createResponse(WeatherServiceCode code, T data) {
		SimpleModule module = new SimpleModule();
		ObjectMapper oMapper = new ObjectMapper();
		oMapper.registerModule(module);
		BaseResponse<T> respuesta = new BaseResponse<T>(code.getResult(), code.getDescription());
		respuesta.setData(data);
		String jsonResponse;
		try {
			jsonResponse = oMapper.writeValueAsString(respuesta);
		} catch (JsonProcessingException e) {
			logger.error(e.getMessage(), e);
			jsonResponse = "{\"result\":1,\"description\":\"error creating Json\",\"data\":" + data + "}";
		}
		return jsonResponse;
	}
	
	public <T> String createResponse(int code, String msg, T data) {
		SimpleModule module = new SimpleModule();

		ObjectMapper oMapper = new ObjectMapper();
		oMapper.registerModule(module);
		BaseResponse<T> response = new BaseResponse<T>(code, msg);
		response.setData(data);
		String jsonResponse;
		try {
			jsonResponse = oMapper.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			logger.error(e.getMessage(), e);
			jsonResponse = "{\"result\":1,\"description\":\"error creating Json\",\"data\":" + data + "}";
		}
		return jsonResponse;
	}

	public <T> String createResponse(WeatherServiceCode code) {
		ObjectMapper oMapper = new ObjectMapper();
		BaseResponse<T> response = new BaseResponse<T>(code.getResult(), code.getDescription());
		String jsonResponse;
		try {
			jsonResponse = oMapper.writeValueAsString(response);
		} catch (JsonProcessingException e) {
			logger.error(e.getMessage(), e);
			jsonResponse = "{\"result\":1,\"description\":\"Error creating Json\",\"data\":null}";
		}
		return jsonResponse;
	}
	
	
}
