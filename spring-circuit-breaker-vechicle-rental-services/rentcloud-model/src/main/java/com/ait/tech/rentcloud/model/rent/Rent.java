package com.ait.tech.rentcloud.model.rent;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "rent")
@Data
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rentId;
    private int customerId;
    private int vehicleId;
    private LocalDateTime rentFrom; // postman use "2024-04-25T10:00:00.123456" (YYYY-MM-DD HH:MM:SS)
    private LocalDateTime rentTill;
    private int currentOdometer;
    private String returnLocation;

}
