package com.weather.challenge.exception;

public class InvalidPasswordException extends Exception {

	private static final long serialVersionUID = -2692193985218022345L;

	public InvalidPasswordException(String message) {
        super(message);
	}

}
