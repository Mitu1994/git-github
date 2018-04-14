package com.javatechie.spring.exp.handel.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter	
@Table(name="ORDER_TB")
@Entity
public class Order {
	@Id
	private int id;
	private String name;
	private String catagory;
	private double amoutnt;
}
