package com.example.StudentRegistrationPortal.service;

import com.example.StudentRegistrationPortal.entity.StudentEntity;

import java.util.List;

public interface StudentService {

    public StudentEntity saveStudent(StudentEntity studentEntity);

    public List<StudentEntity> showAllStudent();
}
