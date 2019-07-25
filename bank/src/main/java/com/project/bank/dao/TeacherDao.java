package com.project.bank.dao;

import com.project.bank.dto.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherDao {
    Teacher getTeacherById(Integer id);

    Teacher selById(Integer id);
}
