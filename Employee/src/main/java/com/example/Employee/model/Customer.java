package com.example.Employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_id")
	private Long customer_id;	
	
	@Column(name="customer_name")
	private String customer_name;

}
