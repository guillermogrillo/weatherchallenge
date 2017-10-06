package com.weather.challenge.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weather.challenge.dto.UserDto;
import com.weather.challenge.dto.UserLoginDto;
import com.weather.challenge.entity.User;
import com.weather.challenge.exception.ExistingUserException;
import com.weather.challenge.exception.InvalidPasswordException;
import com.weather.challenge.exception.UnexistingUserException;
import com.weather.challenge.repository.UserRepository;
import com.weather.challenge.security.SecurityService;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private SecurityService securityService;

	public UserDto getUser(String id) {
		User user = userRepository.findOne(id);
		UserDto dto = new UserDto(user.getId(), user.getUsername());
		return dto;
	}

	public UserDto getUserByUsername(String username) throws UnexistingUserException {
		User user = userRepository.findByUsername(username);
		if (user == null) {
			throw new UnexistingUserException("The user does not exist!");
		}
		UserDto dto = new UserDto(user.getId(), user.getUsername());
		return dto;
	}

	public UserDto login(UserLoginDto dto) throws UnexistingUserException, InvalidPasswordException {
		User user = userRepository.findByUsername(dto.getUsername());
		if (user == null)
			throw new UnexistingUserException("The user does not exist!");
		if (!securityService.checkPassword(dto.getPassword(), user.getPassword())) 
			throw new InvalidPasswordException("The password is incorrect!");
		
		return new UserDto(user.getId(), user.getUsername());
	}

	public void register(UserLoginDto dto) throws ExistingUserException {

		if (userRepository.findByUsername(dto.getUsername()) != null) {
			throw new ExistingUserException("The user already exists!");
		} else {
			User user = new User(dto.getUsername(), securityService.hashPassword(dto.getPassword()));
			userRepository.save(user);
		}
	}

}