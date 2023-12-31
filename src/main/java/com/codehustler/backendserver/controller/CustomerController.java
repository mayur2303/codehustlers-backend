package com.codehustler.backendserver.controller;

import com.codehustler.backendserver.entity.Customer;
import com.codehustler.backendserver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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

        Pageable firstPageWithTwoHundredElements = PageRequest.of(0, 200);
        Page<Customer> customerPage = customerRepository.findAll(firstPageWithTwoHundredElements);
        return ResponseEntity.ok().body(customerPage.toList());
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> getProductById(@PathVariable String id) {
        return ResponseEntity.ok().body(customerRepository.findById(id));
    }
}
