package com.student.management.controller;

import com.student.management.entity.Course;
import com.student.management.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @GetMapping
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/{id}")
    public Course getCourseById(@PathVariable Long id) {
        return courseService.getCourseById(id);
    }
    @GetMapping("/search")
public List<Course> searchCourses(@RequestParam String keyword) {
    return courseService.searchCourses(keyword);
}
@GetMapping("/topic")
public List<Course> searchByTopic(@RequestParam String topic) {
    return courseService.searchByTopic(topic);
}
}