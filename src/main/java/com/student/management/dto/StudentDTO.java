package com.student.management.dto;

import lombok.Data;

@Data
public class StudentDTO {

    private String studentCode;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String mobileNumber;
    private String parentName;
}