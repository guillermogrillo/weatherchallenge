package com.weather.challenge.service;

import com.weather.challenge.dto.UserDto;
import com.weather.challenge.dto.UserLoginDto;
import com.weather.challenge.entity.User;
import com.weather.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserDto getUser(String id) {
		User user = userRepository.findOne(id);
		UserDto dto = new UserDto(user.getId(), user.getUsername());
		return dto;
	}

	public UserDto getUserByUsername(String username) {
		User user = userRepository.findByUsername(username);
		UserDto dto = new UserDto(user.getId(), user.getUsername());
		return dto;
	}

	public void saveUser(UserLoginDto dto) {
		User user = new User(dto.getUsername(), dto.getPassword());
		userRepository.save(user);
	}

}
