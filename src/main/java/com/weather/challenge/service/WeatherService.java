package com.weather.challenge.service;

import java.util.ArrayList;
import java.util.Arrays;

import com.weather.challenge.entity.Board;
import com.weather.challenge.entity.Location;
import com.weather.challenge.entity.User;
import com.weather.challenge.repository.BoardRepository;
import com.weather.challenge.repository.LocationRepository;
import com.weather.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WeatherService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Autowired
    private LocationRepository locationRepository;




}
