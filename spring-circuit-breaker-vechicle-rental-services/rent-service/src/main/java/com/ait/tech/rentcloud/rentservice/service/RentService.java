package com.ait.tech.rentcloud.rentservice.service;

import com.ait.tech.rentcloud.model.rent.Rent;
import com.ait.tech.rentcloud.rentservice.model.DetailResponse;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface RentService {
    Rent save(Rent customer);

    Rent findById(int id);

    List<Rent> findAll();

    DetailResponse findDetailResponse(int id) throws ExecutionException, InterruptedException;
}
