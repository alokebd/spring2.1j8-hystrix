package com.ait.tech.rentcloud.vehicleservice.repository;

import com.ait.tech.rentcloud.model.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleRepository extends JpaRepository<Vehicle,Integer> {
}
