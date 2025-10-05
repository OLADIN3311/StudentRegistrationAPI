package com.example.StudentRegistrationPortal.service;

import com.example.StudentRegistrationPortal.entity.StudentEntity;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public StudentEntity saveStudent(StudentEntity studentEntity);

    public List<StudentEntity> showAllStudent();

    public Optional<StudentEntity> findStudentById(Long id);

    public void deleteByID(Long id);
}
