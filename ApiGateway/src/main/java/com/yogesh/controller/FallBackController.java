package com.yogesh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackController {
	
	@RequestMapping("/flightsearchFallBack")
	public Mono<String> flightSearchFallBack(){
		return Mono.just("Flight Search service is currently down. Try after some time");
	}

	@RequestMapping("/paymentFallBack")
	public Mono<String> paymentFallBack(){
		return Mono.just("Payment service is currently down. Try after some time");
	}
}
