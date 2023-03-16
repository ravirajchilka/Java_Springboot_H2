package com.learn.springboot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.springboot.dao.BankRepository;
import com.learn.springboot.models.Bank;

@RestController
public class BankController {

    @Autowired
    BankRepository bankRepo;
   
    private int count = 0;

    @PostMapping("/bank/post")
    public void saveBank(@RequestBody Bank bank) {
        bank.setId(++this.count);
        this.bankRepo.save(bank);
    }

    @GetMapping("/bank/get")
    public List<Bank> getBanks() {
        return this.bankRepo.findAll();
    }

    @GetMapping("/bank/findbyid/{id}")
    public Optional<Bank> findBank(@PathVariable int id) {
        Optional<Bank> bank = this.bankRepo.findById(id);
        return bank;
    }

    @DeleteMapping("/bank/delete/{id}")
    public void deleteById(@PathVariable int id) {
        this.bankRepo.deleteById(id);
    }

    @PutMapping("/bank/update/{id}")
    public void updateBank(@PathVariable int id) {
        Optional<Bank> bank = this.bankRepo.findById(id);
       //bank.setName
    }
}
