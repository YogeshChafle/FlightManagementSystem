package com.yogesh.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yogesh.model.Booking;

@Repository
public interface BookingRepository extends MongoRepository<Booking, Integer>{

}
