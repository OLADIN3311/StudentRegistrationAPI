package com.example.StudentRegistrationPortal.controller;

import com.example.StudentRegistrationPortal.entity.StudentEntity;
import com.example.StudentRegistrationPortal.service.StudentService;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studentapi")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public StudentEntity saveStudent(@RequestBody StudentEntity studentEntity){

        return studentService.saveStudent(studentEntity);
    }

    @GetMapping()
    public List<StudentEntity> getAllStudent() {

        return studentService.showAllStudent();
    }
}
