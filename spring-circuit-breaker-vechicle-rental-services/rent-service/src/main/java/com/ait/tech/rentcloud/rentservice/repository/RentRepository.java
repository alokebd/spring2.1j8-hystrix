package com.ait.tech.rentcloud.rentservice.repository;

import com.ait.tech.rentcloud.model.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface RentRepository extends JpaRepository<Rent,Integer> {
}
