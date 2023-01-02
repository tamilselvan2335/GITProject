package com.example.Employee.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "customer")
public class Customer {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="customer_id")
	private Long customer_id;	
	
	@Column(name="customer_name")
	private String customer_name;

	@ManyToMany(mappedBy = "customers", cascade = { CascadeType.ALL })
	private List<Company> companies;

}
