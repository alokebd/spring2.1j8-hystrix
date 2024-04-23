package com.ait.tech.rentcloud.customerservice.controller;

import com.ait.tech.rentcloud.model.customer.Customer;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ait.tech.rentcloud.customerservice.dto.CutomerDto;
import com.ait.tech.rentcloud.customerservice.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/services/customers")
public class CustomerServiceController {

    @Autowired
    private CustomerService customerService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    public ResponseEntity<CutomerDto> save(@RequestBody Customer customer) {
        Customer newCustomer =customerService.save(customer);
        if (newCustomer != null) {
        	CutomerDto data = modelMapper.map(newCustomer, CutomerDto.class);
        	return ResponseEntity.ok().body(data);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new CutomerDto());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<CutomerDto> getCustomer(@PathVariable int id) {
        Customer customer= customerService.findById(id);
        if (customer != null) {
        	CutomerDto data = modelMapper.map(customer, CutomerDto.class);
        	return ResponseEntity.ok().body(data);
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new CutomerDto());
    }

    @GetMapping
    public ResponseEntity<List<CutomerDto>> getAllCustomers() {
    	List<Customer> listCust= customerService.findAll();
    	if (listCust != null && listCust.size()>0) {
    		List<CutomerDto> data = listCust
    				  .stream()
    				  .map(cust -> modelMapper
    				   .map(cust, CutomerDto.class))
    				  .collect(Collectors.toList());
    		return ResponseEntity.ok().body(data);
    	}
    	List<CutomerDto> defaultData = new ArrayList<>();
    	defaultData.add(new CutomerDto());
    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(defaultData);
    }




}
