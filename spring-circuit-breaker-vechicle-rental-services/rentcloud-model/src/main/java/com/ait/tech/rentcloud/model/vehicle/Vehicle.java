package com.ait.tech.rentcloud.model.vehicle;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="vehicle")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String make;
    private String model;
    private String type;
    private int year;
    private int odometerValueOnRegister;
    private String color;
}
