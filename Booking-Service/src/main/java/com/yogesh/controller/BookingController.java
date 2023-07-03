package com.yogesh.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogesh.model.Booking;
import com.yogesh.service.BookingService;

import jakarta.validation.Valid;


/*
 * @author Yogesh
 * Booking service
 */
@RestController
public class BookingController {
	
	/*
	 * Autowireing of BookkingService
	 */
	@Autowired
	private BookingService service;
	
	/*
	 * This is post method for user to book their seat and need to add user data
	 */
	@PostMapping("/doBooking")
	public Booking doBooking(@RequestBody @Valid Booking booking) {
		return service.saveBooking(booking);
	}
	
	/*
	 * Access the booking information just by entering bookingId
	 */
	@GetMapping("/getBooking/{bookingId}")
	public Optional<Booking> getBooking(@PathVariable("bookingId") int bookingId) {
		return service.findById(bookingId);
	}
	/*
	 * update method to change the data as per user requirement
	 */
	@PutMapping("/updateBooking/{bookingId}")
	public String updateBooking(@RequestBody Booking booking, @PathVariable("bookingId") int bookingId) {
		return service.updateBoooking(booking, bookingId);
	}
	
	
	/*
	 * This method is for cancelling booking that user made 
	 */
	@DeleteMapping("/cancelBooking/{bookingId}")
	public String cancelBooking(@RequestBody Booking booking, @PathVariable("bookingId") int bookingId){
		return service.cancelBooking(booking, bookingId);
		
	}
	
	

}
