package com.ait.tech.rentcloud.customerservice.service;

import com.ait.tech.rentcloud.model.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);

    Customer findById(int id);

    List<Customer> findAll();
}
