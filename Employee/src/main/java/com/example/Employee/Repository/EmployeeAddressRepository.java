package com.example.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.model.EmployeeAddress;

public interface EmployeeAddressRepository extends JpaRepository<EmployeeAddress,Integer>{

}
