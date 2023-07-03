package com.yogesh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yogesh.model.Booking;
import com.yogesh.repository.BookingRepository;

@Service
public class BookingService {
	
	/*
	 * Autowiring BookingRepository to connect to database
	 */
	@Autowired
	private BookingRepository repository;
	
	
	/*
	 * This saves the data into db
	 */
	public Booking saveBooking(Booking booking) {
		return repository.save(booking);
	}


	

	public Optional<Booking> findById(int bookingId) {
		return repository.findById(bookingId);
	}



	/*
	 * Method for cancel booking by id
	 */
	public String cancelBooking(Booking booking, int bookingId) {
		if(bookingId == booking.getBookingId()) {
			repository.delete(booking);
		}
		return "Booking has been Cancel for ID_"+ booking.getBookingId();
	}



	/*
	 * UpdateBooking is use to update the data enter by the user such as name, age, email, phoneNo etc
	 */
	public String updateBoooking(Booking booking, int bookingId) {
		booking.setBookingId(bookingId);
		repository.save(booking);
		return "Booking has been Updated successfully for ID_"+booking.getBookingId();
	}

}