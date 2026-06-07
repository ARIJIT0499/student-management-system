package com.student.management.dto;

import lombok.Data;

@Data
public class AddressDTO {

    private String addressType;
    private String addressLine;
    private String city;
    private String state;
    private String pincode;
}