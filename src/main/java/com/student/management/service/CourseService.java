package com.student.management.service;

import com.student.management.entity.Course;
import com.student.management.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        return courseRepository.findById(id).orElse(null);
    }
    public List<Course> searchCourses(String keyword) {
    return courseRepository.findByCourseNameContainingIgnoreCase(keyword);
}
public List<Course> searchByTopic(String topic) {
    return courseRepository.findByTopicsContainingIgnoreCase(topic);
}
}