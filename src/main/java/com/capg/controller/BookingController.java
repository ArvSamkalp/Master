package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entities.Booking;
import com.capg.service.IBookingService;

@RestController

public class BookingController {
    
	@Autowired
	
	IBookingService service;
	@GetMapping("/booking")
	List<Booking> getBookings(){
		  System.out.println("fetching booking records");
	        return this.service.getBookings();
	}
	@GetMapping("/booking/{bookingId}")
	public Booking getBookingById(@PathVariable int bookingId) {
		return this.service.getBookingById(bookingId);
	}
	@PostMapping("/booking")
	public Booking addBooking(@RequestBody Booking booking) {
		  return this.service.addBooking(booking);
	}
	
	@PutMapping("/booking")
	public Booking updateBooking(@RequestBody Booking booking) {
		  return this.service.updateBooking(booking);
	}
	
	@DeleteMapping("/booking/{bookingId}")
	 public ResponseEntity<HttpStatus> deleteBooking(@PathVariable int bookingId){
		try {
	         this.service.deleteBooking(bookingId);
	         return new ResponseEntity<>(HttpStatus.OK);
	    }
	        catch(Exception ex) {
	            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	}
	
	
	
}
