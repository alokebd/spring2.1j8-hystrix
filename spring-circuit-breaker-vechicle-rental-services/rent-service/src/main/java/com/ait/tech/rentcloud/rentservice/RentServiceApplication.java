package com.ait.tech.rentcloud.rentservice;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EntityScan(basePackages = "com.ait.tech.rentcloud.model.rent")
@EnableEurekaClient
@EnableCircuitBreaker
public class RentServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RentServiceApplication.class, args);
    }
    
    @Bean
   	public ModelMapper modelMapper() {
   		return new ModelMapper();
   	}

}
