package com.weather.challenge.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Board {

	@Id
	private String id;
	private String description;
	@DBRef
	private User user;
	private List<String> woeids;

	public Board() {
		woeids = new ArrayList<>();
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

	public List<String> getWoeids() {
		return woeids;
	}

	public void setWoeids(List<String> woeids) {
		this.woeids = woeids;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
