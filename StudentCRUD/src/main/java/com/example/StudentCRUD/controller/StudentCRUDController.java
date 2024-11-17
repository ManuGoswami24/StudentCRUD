package com.example.StudentCRUD.controller;

import com.example.StudentCRUD.entity.Student;
import com.example.StudentCRUD.service.StudentCRUDService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentCRUDController {
    private final StudentCRUDService studentCRUDService;

    @Autowired
    public StudentCRUDController(StudentCRUDService studentCRUDService){
           this.studentCRUDService= studentCRUDService;
    }

    @GetMapping
    public List<Student> getAllStudents(){
           return StudentCRUDService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        return studentCRUDService.getStudentById()
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return StudentCRUDService.addStudent(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id , @RequestBody Student studentDetails){
        try {
            Student updatedStudent = studentCRUDService.updateStudent(id, studentDetails);
            return ResponseEntity.ok(updatedStudent);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id){
        StudentCRUDService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }
}
