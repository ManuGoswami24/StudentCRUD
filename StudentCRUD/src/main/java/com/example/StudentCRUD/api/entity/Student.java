package com.example.StudentCRUD.api.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Table(name= "studentDetails")
@Data
public class Student {
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age ;
    private String course;

}

