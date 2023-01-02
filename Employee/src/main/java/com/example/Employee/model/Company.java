package com.example.Employee.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name= "company")
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Company_id")
	private int c_id;	
	
	@Column(name="c_name")
	private String c_name;

	@Column(name="address")
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="Company_id", referencedColumnName="Company_id")
    private List<Employees> empDetails= new ArrayList<>();

	@ManyToMany(cascade = {
			CascadeType.ALL
	})
	@JoinTable(
			name = "company_customer", joinColumns = {@JoinColumn(name = "Company_id")},
			inverseJoinColumns = {@JoinColumn(name = "customer_id")})
	private List<Customer> customers;

	public Company(){
		
	}
	
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public List<Employees> getEmpDetails() {
		return empDetails;
	}

	public void setEmpDetails(List<Employees> empDetails) {
		this.empDetails = empDetails;
	}
	
	public Company(int c_id, String c_name, String address) {
		super();
		this.c_id = c_id;
		this.c_name = c_name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Company [c_id=" + c_id + ", c_name=" + c_name + ", address=" + address + "]";
	}

}
