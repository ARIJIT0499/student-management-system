package com.student.management.controller;

import com.student.management.entity.Course;
import com.student.management.entity.Student;
import com.student.management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/search")
    public List<Student> searchStudent(@RequestParam String name) {
        return studentService.searchByName(name);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }
    @PostMapping("/validate")
    public Student validateStudent(@RequestBody Student student) {
        return studentService.validateStudent(
            student.getStudentCode(),
            student.getDateOfBirth()
    );
}
@PostMapping("/{studentId}/courses/{courseId}")
public Student assignCourse(
        @PathVariable Long studentId,
        @PathVariable Long courseId) {

    return studentService.assignCourse(studentId, courseId);
}
@GetMapping("/course/{courseId}")
public List<Student> getStudentsByCourse(
        @PathVariable Long courseId) {

    return studentService.getStudentsByCourse(courseId);
}
@PutMapping("/{id}")
public Student updateStudent(
        @PathVariable Long id,
        @RequestBody Student student) {
    return studentService.updateStudent(id, student);
}
@DeleteMapping("/{id}")
public String deleteStudent(@PathVariable Long id) {
    studentService.deleteStudent(id);
    return "Student deleted successfully";
}
@DeleteMapping("/{studentId}/courses/{courseId}")
public Student removeCourse(
        @PathVariable Long studentId,
        @PathVariable Long courseId) {

    return studentService.removeCourse(studentId, courseId);
}
@GetMapping("/{id}/courses")
public List<Course> getStudentCourses(@PathVariable Long id) {
    return studentService.getStudentCourses(id);
}

}