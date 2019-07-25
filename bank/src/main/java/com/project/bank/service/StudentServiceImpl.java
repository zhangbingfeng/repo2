package com.project.bank.service;

import com.project.bank.dao.StudentDao;
import com.project.bank.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDao studentDao;

    @Override
    public Student getStudentById() {
        return studentDao.getStudentById();
    }
}
