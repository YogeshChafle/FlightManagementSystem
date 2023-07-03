package com.yogesh.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yogesh.model.Payment;
import com.yogesh.service.PaymentService;

@RestController
public class PaymentController {
	
	private PaymentService service;
	
	@PostMapping("/doPayment")
	public Payment doPayment(@RequestBody Payment payment) {
		return service.doPayment(payment);
	}
	

}
