package com.project.bank.service;

import com.project.bank.dto.Teacher;

public interface TeacherService {
    Teacher getTeacherById(Integer id);

    Teacher selById(Integer id);
}
