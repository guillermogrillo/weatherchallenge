package com.weather.challenge.service;

import com.weather.challenge.dto.UserDto;
import com.weather.challenge.dto.UserLoginDto;
import com.weather.challenge.entity.User;
import com.weather.challenge.exception.ExistingUserException;
import com.weather.challenge.exception.UnexistingUserException;
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

	public UserDto getUserByUsername(String username) throws UnexistingUserException{
		User user = userRepository.findByUsername(username);
		if(user == null){
			throw new UnexistingUserException("The user does not exist");
		}
		UserDto dto = new UserDto(user.getId(), user.getUsername());
		return dto;
	}
	
	public UserDto getUserByUsernameAndPassword(String username, String password) throws UnexistingUserException {
		User user = userRepository.findByUsernameAndPassword(username, password);
		if(user == null){
			throw new UnexistingUserException("The user does not exist");
		}
		UserDto dto = new UserDto(user.getId(), user.getUsername());
		return dto;
	}

	public void saveUser(UserLoginDto dto) throws ExistingUserException {
		if (userRepository.findByUsername(dto.getUsername()) != null) {
			throw new ExistingUserException("The user already exists!");
		} else {
			User user = new User(dto.getUsername(), dto.getPassword());
			userRepository.save(user);
		}
	}

}
