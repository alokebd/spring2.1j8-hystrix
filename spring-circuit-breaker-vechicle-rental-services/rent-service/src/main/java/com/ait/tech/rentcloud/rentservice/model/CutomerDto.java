package com.ait.tech.rentcloud.rentservice.model;

import java.util.List;



import lombok.Data;

@Data
public class CutomerDto {
	//private int id;
	private String firstName;
    private String lastName;
    private String dlNumber;
    private String zipcode;
    private List<LoyaityDto> loyalities;
}

