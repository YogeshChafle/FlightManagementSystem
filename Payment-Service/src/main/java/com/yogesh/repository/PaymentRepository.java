package com.yogesh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yogesh.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
