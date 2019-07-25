package com.project.bank.service;

import com.project.bank.dao.TeacherDao;
import com.project.bank.dto.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    TeacherDao teacherDao;

    @Override
    public Teacher getTeacherById(Integer id) {
        return teacherDao.getTeacherById(id);
    }

    @Override
    public Teacher selById(Integer id) {
        return teacherDao.selById(id);
    }
}
