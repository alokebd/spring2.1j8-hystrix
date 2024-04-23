package com.ait.tech.rentcloud.customerservice.dto;

import java.util.List;

import lombok.Data;

@Data
public class CutomerDto {
	private String firstName;
    private String lastName;
    private String dlNumber;
    private String zipcode;
    private List<LoyaityDto> loyalities;
}
