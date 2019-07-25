package com.project.bank;

import com.project.bank.dto.Example;
import com.project.bank.dto.Student;
import com.project.bank.dto.Teacher;
import com.project.bank.service.ExampleService;
import com.project.bank.service.StudentService;
import com.project.bank.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class BankApplicationTests {
    @Autowired
    ExampleService exampleService;
    @Autowired
    TeacherService teacherService;
    @Autowired
    StudentService studentService;

    @Test
    public void contextLoads() {
        System.out.println("你好");
    }

    @Test
    public void select() {
        Example res = exampleService.getTestById(1);
        // Example res1=exampleService.getExampleById(1);
        Example res2 = exampleService.getUpdateById(2);
        //  Example res3=exampleService.getAddById(27,"nihao");
        System.out.println(res.toString());

        //System.out.println(res1);
        System.out.println(res2);
        // System.out.println(res3);
        Teacher kk = teacherService.getTeacherById(2);
    }

    @Test
    public void teacher() {
        Teacher kk = teacherService.getTeacherById(2);
        System.out.println(kk);
        Teacher kkk = teacherService.selById(2);
        System.out.println(kkk);
    }

    @Test
    public void student() {
        Student st = studentService.getStudentById();
        System.out.println(st);
    }

}
