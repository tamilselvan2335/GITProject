package com.example.Employee.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Employee.model.Headquarter;

public interface HeadquarterRepository extends JpaRepository<Headquarter, Long> {

}
