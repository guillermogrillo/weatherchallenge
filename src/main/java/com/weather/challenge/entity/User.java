package com.weather.challenge.entity;

import com.weather.challenge.dto.UserDto;
import org.springframework.data.annotation.Id;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

public class User {

    @Id
    private String id;
    private String username;
    private String password;


    public User(UserDto dto) {
        this.username = dto.getUsername();
        this.password = dto.getPassword();
    }
    public User(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
