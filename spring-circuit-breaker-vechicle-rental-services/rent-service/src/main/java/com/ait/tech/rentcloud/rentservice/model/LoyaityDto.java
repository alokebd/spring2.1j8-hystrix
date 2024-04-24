package com.ait.tech.rentcloud.rentservice.model;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class LoyaityDto {
	 private int point;
	 private LocalDateTime expireDate;
}