package com.example.StudentCRUD.service;

import com.example.StudentCRUD.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentCRUDService {
    List<Student> getAllStudents();
    Optional<Student> getStudentById(Long id);
    Student addStudent(Student student);
    Student updateStudent(Long id,Student studentDetails);
    void deleteStudent(Long id);
}
