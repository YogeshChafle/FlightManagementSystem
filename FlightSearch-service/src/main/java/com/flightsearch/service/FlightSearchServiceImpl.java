package com.flightsearch.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightsearch.models.*;
import com.flightsearch.service.*;
import com.flightsearch.Repository.*;
@Service
public class FlightSearchServiceImpl implements FlightSearchService{
	@Autowired
	private FlightSearchRepository repo;

	
	//Method for Admin to Add Flights
	@Override
	public String addFlight(Flight flight) {
		// TODO Auto-generated method stub
		repo.save(flight);
		return "Added Flight:"+ flight.getAirline() +flight.getFlight_number();
	}
    
	
	//Method for Admin to Update Flight
	@Override
	public String updateFlight(Flight flight , int flight_number) {
		// TODO Auto-generated method stub
		flight.setFlight_number(flight_number);
		repo.save(flight);
		return "Updated Flight:"+ flight.getAirline() +flight.getFlight_number();
	}

    //Method for Admin to Remove Flight
	@Override
	public String deleteFlight(Flight flight, int flight_id) {
		// TODO Auto-generated method stub
		if(flight_id == flight.getId()) {
		repo.delete(flight);
		}
		return "Removed Flight:"+ flight.getAirline() +flight.getFlight_number();
	}


	//Method for User to Search All Flights
	@Override
	public List<Flight> getAllFlights() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	//Method for User to Search All Flights by Departure Location and Arrival Location
	@Override
	public ArrayList<Flight> getFlightByLocation(String departure_loc, String arrival_loc) {
		// TODO Auto-generated method stub
		return (ArrayList<Flight>) repo.findByData(departure_loc,arrival_loc)	;	
	}

    


}
