package com.student.management.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String courseName;
    private String description;
    private String courseType;
    private String duration;
    private String topics;

    @JsonIgnore
@ManyToMany(mappedBy = "courses")
private List<Student> students;
}