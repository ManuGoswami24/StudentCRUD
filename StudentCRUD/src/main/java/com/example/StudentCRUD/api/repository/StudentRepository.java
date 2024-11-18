package com.example.StudentCRUD.api.repository;

import com.example.StudentCRUD.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
