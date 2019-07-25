package com.project.bank.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    private int id;
    private String name;
    private int age;
    private int tid;
    private Teacher teacher;
}
