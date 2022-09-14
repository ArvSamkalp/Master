package com.capg.service;

import java.util.List;

import com.capg.entities.Booking;

public interface IBookingService {
	public Booking getBookingById(int bookingId);
	public Booking addBooking(Booking booking);
	public Booking updateBooking(Booking booking);
	public void deleteBooking(int bookingId);
	List<Booking> getBookings();
}
