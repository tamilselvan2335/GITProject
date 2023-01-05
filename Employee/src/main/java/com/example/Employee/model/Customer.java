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

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public List<Company> getCompanies() {
		return companies;
	}

	public void setCompanies(List<Company> companies) {
		this.companies = companies;
	}

	public Customer(Long customer_id, String customer_name, List<Company> companies) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.companies = companies;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
