package com.example.StudentCRUD.repository;

import com.example.StudentCRUD.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
