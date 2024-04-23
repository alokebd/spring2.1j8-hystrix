package com.ait.tech.rentcloud.vehicleservice.service;

import com.ait.tech.rentcloud.model.vehicle.Vehicle;
import com.ait.tech.rentcloud.vehicleservice.repository.VehicleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;


    @Override
    public Vehicle save(Vehicle customer) {
        return vehicleRepository.save(customer);
    }


    @Override
    public Vehicle findById(int id) {
        Optional<Vehicle> vehicle = vehicleRepository.findById(id);

        if (vehicle.isPresent())
            return vehicle.get();
        else
            return new Vehicle();

    }


    @Override
    public List<Vehicle> findAll() {
        return vehicleRepository.findAll();
    }
}
