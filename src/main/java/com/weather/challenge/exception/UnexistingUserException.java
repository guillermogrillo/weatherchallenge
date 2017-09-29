package com.weather.challenge.exception;

public class UnexistingUserException extends Exception {

	private static final long serialVersionUID = 7955853739717451291L;

	public UnexistingUserException(String message) {
        super(message);
	}
}
