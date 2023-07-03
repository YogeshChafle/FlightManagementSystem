package com.yogesh.service;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.yogesh.model.UserCredential;
import com.yogesh.repository.UserCredentialRepository;

@Service
public class AuthService {
	
	@Autowired
	UserCredentialRepository repository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	JwtService jwtService;
	
	public String saveUser(UserCredential user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		repository.save(user);
		return "User has been added";
	}
	
	public String generateToken(String username) {
		return jwtService.generateToken(username);
	}
	
	public void validateToken(String token) {
		jwtService.validateToken(token);
	}

}
