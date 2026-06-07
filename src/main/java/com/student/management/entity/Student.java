package com.student.management.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String studentCode;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String email;
    private String mobileNumber;
    private String parentName;

    @JsonManagedReference
@OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
private List<Address> addresses;

@ManyToMany
@JoinTable(
        name = "student_course",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "course_id")
)
private List<Course> courses;
}
