package com.codehustler.backendserver.controller;

import com.codehustler.backendserver.entity.Customer;
import com.codehustler.backendserver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public ResponseEntity<List<Customer>> getAllProduct() {
        return ResponseEntity.ok().body(customerRepository.findAll());
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getProductById(@PathVariable long id) {
        return ResponseEntity.ok().body(customerRepository.getReferenceById(id));
    }
}
