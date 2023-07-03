package com.yogesh.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yogesh.model.UserCredential;

@Repository
public interface UserCredentialRepository extends MongoRepository<UserCredential, Integer>{
	    Optional<UserCredential> findByName(String username);
	
}
