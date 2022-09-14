package com.capg.exceptionhandler;

public class UserNotFoundException extends ResourceNotFoundException {

	private static final long serialVersionUID = -3795717615678598341L;

	public UserNotFoundException(int userId) {
		super("User", "user-id", userId);
	}
}
