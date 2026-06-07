package com.student.management.service;

import com.student.management.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    void testSaveStudent() {

        Student student = new Student();
        student.setStudentCode("TEST001");
        student.setName("Test User");

        Student savedStudent = studentService.saveStudent(student);

        assertNotNull(savedStudent);
        assertEquals("TEST001", savedStudent.getStudentCode());
    }
}