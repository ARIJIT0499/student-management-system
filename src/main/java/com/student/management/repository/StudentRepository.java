package com.student.management.repository;

import com.student.management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByNameContainingIgnoreCase(String name);
    Student findByStudentCodeAndDateOfBirth(String studentCode, String dateOfBirth);
    List<Student> findByCourses_Id(Long courseId);
}