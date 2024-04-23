package com.ait.tech.rentcloud.customerservice.repository;

import com.ait.tech.rentcloud.model.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
