package com.student.management.repository;

import com.student.management.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByCourseNameContainingIgnoreCase(String keyword);
    List<Course> findByTopicsContainingIgnoreCase(String topic);
}