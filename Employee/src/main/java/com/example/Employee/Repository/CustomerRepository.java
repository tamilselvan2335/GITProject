package com.example.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
