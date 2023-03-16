package com.learn.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learn.springboot.models.Bank;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {
    
}
