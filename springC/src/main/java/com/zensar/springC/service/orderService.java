package com.zensar.springC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.springC.bean.Order;
import com.zensar.springC.repository.orderRepository;

@Service
public class orderService {
@Autowired
private orderRepository repository;

public Order saveOrder(Order order) {
	return repository.save(order);
}
}
