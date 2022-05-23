package com.zensar.springC.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.springC.bean.Order;

public interface orderRepository extends JpaRepository<Order, Integer>{

}
