package com.javatechie.spring.exp.handel.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javatechie.spring.exp.handel.dao.OrderDao;
import com.javatechie.spring.exp.handel.model.Order;

@Service
public class OrderService {

	@Autowired
	private OrderDao orderDao;

	@PostConstruct
	public void addOrder2Db(){
		List<Order> orders=new ArrayList<>();
		orders.add(new Order(1, "mobile", "CAT-1", 392.4));
		orders.add(new Order(2, "leptop", "CAT-2", 321.1));
		orders.add(new Order(3, "tablet", "CAT-3", 535.6));
		orders.add(new Order(4, "land phone", "CAT-4", 754.3));
		orders.add(new Order(5, "TV", "CAT-5", 654.6));
		
	}
	
	public double getPrice(String productName){
		Order order=orderDao.findByName(productName);
		return order.getAmoutnt();
	}
}
