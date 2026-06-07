package com.student.management.dto;

import lombok.Data;

@Data
public class CourseDTO {

    private String courseName;
    private String description;
    private String courseType;
    private String duration;
    private String topics;
}