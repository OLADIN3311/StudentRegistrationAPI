package com.example.StudentRegistrationPortal.controller;

import com.example.StudentRegistrationPortal.entity.StudentEntity;
import com.example.StudentRegistrationPortal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("find/{id}")
    public Optional<StudentEntity> findStudentById(@PathVariable("id") Long id) {

        return studentService.findStudentById(id);
    }

    @PostMapping("delete/{id}")
    public String deleteStudentById(@PathVariable("id") Long id) {

        studentService.deleteByID(id);
        return "Deleted Successfully";
    }
}
