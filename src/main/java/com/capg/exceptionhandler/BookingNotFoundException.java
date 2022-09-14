package com.capg.exceptionhandler;

public class BookingNotFoundException extends ResourceNotFoundException{

	private static final long serialVersionUID = 5713894236280974235L;

	public BookingNotFoundException(int bookingId) {
		super("Booking", "booking-id", bookingId);
	}

}
