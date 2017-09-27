package com.weather.challenge.service;

import com.weather.challenge.dto.UserDto;
import com.weather.challenge.entity.User;
import com.weather.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User getUser(String id){
        User user = userRepository.findOne(id);
        return user;
    }

    public void saveUser(UserDto dto) {
        User user = new User(dto);
        userRepository.save(user);
    }


}
