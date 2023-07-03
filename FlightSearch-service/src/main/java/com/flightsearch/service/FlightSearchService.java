package com.flightsearch.service;

import java.util.ArrayList;
import java.util.List;
import com.flightsearch.models.*;

public interface FlightSearchService {
	public String addFlight(Flight flight);
	
	public String updateFlight(Flight flight,int flight_number);
	
	public String deleteFlight(Flight flight, int flight_id);
    
	public List<Flight> getAllFlights();
	
	public 	ArrayList<Flight> getFlightByLocation(String depature_loc , String arrival_loc);

}
