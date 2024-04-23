package com.ait.tech.rentcloud.customerservice.service;

import com.ait.tech.rentcloud.model.customer.Customer;
import com.ait.tech.rentcloud.model.customer.Loyality;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.tech.rentcloud.customerservice.repository.CustomerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isPresent())
            return customer.get();
        else
            return new Customer();

    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
