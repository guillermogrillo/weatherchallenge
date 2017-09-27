package com.weather.challenge.dto;

import com.weather.challenge.entity.Board;

public class BoardDto {

    private String id;
    private String description;

    public BoardDto(String description) {
        this.description = description;
    }

    public BoardDto(Board board) {
        this.description = board.getDescription();
        this.id = board.getId();
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

}
