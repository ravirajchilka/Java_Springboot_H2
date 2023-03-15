package com.learn.springboot.model;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String name;
    private String dept;
    private int salary;

    public Employee(String id, String dept, int salary) {
        this.id = id;
        this.dept = dept;
        this.salary = salary;
    }    

    public String getName() {
        return this.name;
    }

    public String getDept(String dept) {
        return this.dept;
    }

    public int getSalary(int salary) {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
