package com.weather.challenge.dto;

import com.weather.challenge.entity.Board;

public class BoardDto {

    private String id;
    private String description;
    private UserDto user;

    public BoardDto() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public UserDto getUser() {
        return user;
    }

    public void setUser(UserDto user) {
        this.user = user;
    }
}
