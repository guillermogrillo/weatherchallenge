package com.weather.challenge.exception;

public class ExistingUserException extends Exception {

	private static final long serialVersionUID = -9138780500608640259L;

	public ExistingUserException(String message) {
        super(message);
	}
}
