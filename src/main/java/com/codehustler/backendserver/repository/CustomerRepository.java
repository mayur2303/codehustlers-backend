package com.codehustler.backendserver.repository;

import com.codehustler.backendserver.entity.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository<Customer, String> {
    Customer findById(String id);
}
