package com.project.bank.dao;

import com.project.bank.dto.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentDao {
    Student getStudentById();
}
