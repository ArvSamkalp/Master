package com.capg.exceptionhandler;

public class BookingNotFoundForUserException extends ResourceNotFoundException {

	private static final long serialVersionUID = 4421402940969968243L;

	public BookingNotFoundForUserException(int userId) {
		super("Booking for Passenger", "user-id", userId);
	}

}
