package com.example.StudentRegistrationPortal.service;

import com.example.StudentRegistrationPortal.entity.StudentEntity;
import com.example.StudentRegistrationPortal.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentEntity saveStudent(StudentEntity studentEntity) {

        return studentRepository.save(studentEntity);
    }

    @Override
    public List<StudentEntity> showAllStudent() {
        return studentRepository.findAll();
    }


}
