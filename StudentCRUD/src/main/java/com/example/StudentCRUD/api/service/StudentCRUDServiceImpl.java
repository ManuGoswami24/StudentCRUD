package com.example.StudentCRUD.api.service;

import com.example.StudentCRUD.api.entity.Student;
import com.example.StudentCRUD.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentCRUDServiceImpl implements StudentCRUDService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentCRUDServiceImpl(StudentRepository studentRepository){
        this.studentRepository= studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        return studentRepository.findById(id).map(student -> {
            student.setName(studentDetails.getName());
            student.setAge(studentDetails.getAge());
            student.setCourse(studentDetails.getCourse());
            return studentRepository.save(student);
        }).orElseThrow(()-> new RuntimeException("Student not found"));
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
