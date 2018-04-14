package com.javatechie.spring.exp.handel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.exp.handel.service.OrderService;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@GetMapping("/getprice/{prodName}")
	public String 	getOrderPrice(@PathVariable("prodName")String productName){
		double amount=service.getPrice(productName);
		return "Amount for the "+productName+" is "+amount;
	}
}
