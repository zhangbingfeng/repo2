package com.project.bank.service;


import com.project.bank.dao.ExampleDao;
import com.project.bank.dto.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl implements ExampleService {
    @Autowired
    ExampleDao exampleDao;

    @Override
    public Example getTestById(Integer id) {
        return exampleDao.getTestById(id);
    }

    @Override
    public Example getExampleById(Integer id) {
        return exampleDao.getExampleById(id);
    }

    @Override
    public Example getUpdateById(Integer id) {
        return exampleDao.getUpdateById(id);
    }

    @Override
    public Example getAddById(Integer id, String name) {
        return exampleDao.getAddById(id, name);
    }
}
