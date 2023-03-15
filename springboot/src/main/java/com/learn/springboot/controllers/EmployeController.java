package com.learn.springboot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.dao.EmployeeRepository;
import com.learn.springboot.model.Employee;

@RestController
public class EmployeController {


    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/employee/post")
    public void postEmployee(@RequestBody Employee employee) {
        this.repository.save(employee);
    }

    @GetMapping("/employee/getEmployees")
    public List<Employee> getList() {
        return this.repository.findAll();
    }

    @GetMapping("/employee/message")
    public String printHello() {
        return "Hellow world";
    }

}
