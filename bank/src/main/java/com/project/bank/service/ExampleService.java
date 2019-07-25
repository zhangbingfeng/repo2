package com.project.bank.service;

import com.project.bank.dto.Example;


public interface ExampleService {

    public Example getTestById(Integer id);

    public Example getExampleById(Integer id);

    Example getUpdateById(Integer id);

    Example getAddById(Integer id, String name);
}
