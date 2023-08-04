package com.example.ddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ddemo.model.Employee;

public interface  EmployeeRepository extends JpaRepository<Employee ,Long> {
    
}
