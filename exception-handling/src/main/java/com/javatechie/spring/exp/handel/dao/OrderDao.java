package com.javatechie.spring.exp.handel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.exp.handel.model.Order;

public interface OrderDao extends JpaRepository<Order, Integer>{
	Order findByName(String productName);
}
