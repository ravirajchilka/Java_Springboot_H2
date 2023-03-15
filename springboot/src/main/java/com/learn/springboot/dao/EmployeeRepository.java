package com.learn.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    
}
