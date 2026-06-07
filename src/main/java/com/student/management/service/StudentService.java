package com.student.management.service;

import com.student.management.entity.Student;
import com.student.management.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.student.management.entity.Course;
import com.student.management.repository.CourseRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> searchByName(String name) {
        return studentRepository.findByNameContainingIgnoreCase(name);
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
    public Student validateStudent(String studentCode, String dateOfBirth) {
    return studentRepository.findByStudentCodeAndDateOfBirth(studentCode, dateOfBirth);
}
@Autowired
private CourseRepository courseRepository;

public Student assignCourse(Long studentId, Long courseId) {

    Student student = studentRepository.findById(studentId)
            .orElseThrow(() -> new RuntimeException("Student not found"));

    Course course = courseRepository.findById(courseId)
            .orElseThrow(() -> new RuntimeException("Course not found"));

    student.getCourses().add(course);

    return studentRepository.save(student);
}
public List<Student> getStudentsByCourse(Long courseId) {
    return studentRepository.findByCourses_Id(courseId);
}
public Student updateStudent(Long id, Student updatedStudent) {

    Student student = studentRepository.findById(id).orElse(null);

    if (student != null) {

        student.setEmail(updatedStudent.getEmail());
        student.setMobileNumber(updatedStudent.getMobileNumber());
        student.setParentName(updatedStudent.getParentName());

        if(updatedStudent.getAddresses() != null) {

            updatedStudent.getAddresses().forEach(address ->
                    address.setStudent(student));

            student.setAddresses(updatedStudent.getAddresses());
        }

        return studentRepository.save(student);
    }

    return null;
}
public void deleteStudent(Long id) {
    studentRepository.deleteById(id);
}


public Student removeCourse(Long studentId, Long courseId) {

    Student student = studentRepository.findById(studentId).orElse(null);

    if (student == null) {
        return null;
    }

    student.getCourses().removeIf(course -> course.getId().equals(courseId));

    return studentRepository.save(student);
}
public List<Course> getStudentCourses(Long studentId) {

    Student student = studentRepository.findById(studentId).orElse(null);

    if (student == null) {
        return null;
    }

    return student.getCourses();
}

}