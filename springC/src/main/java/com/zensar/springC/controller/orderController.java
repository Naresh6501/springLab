package com.zensar.springC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.springC.bean.Order;
import com.zensar.springC.service.orderService;

@RestController
@RequestMapping("/order")
public class orderController {
@Autowired
private orderService service;
@PostMapping("/bookOrder")
public Order bookOrder(@RequestBody Order order) {
	return service.saveOrder(order);
}
}
