package com.zensar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.bean.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
