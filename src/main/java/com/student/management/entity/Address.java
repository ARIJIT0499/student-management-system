package com.student.management.entity;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Data
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String addressType;
    private String addressLine;
    private String city;
    private String state;
    private String pincode;

    @JsonBackReference
@ManyToOne
@JoinColumn(name = "student_id")
private Student student;
}