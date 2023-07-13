package com.codehustler.backendserver.repository;

import org.springframework.stereotype.Repository;
import com.codehustler.backendserver.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
