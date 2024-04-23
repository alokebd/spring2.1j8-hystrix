package com.ait.tech.rentcloud.customerservice.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class LoyaityDto {
	 private int point;
	 private LocalDateTime expireDate;
}
