package com.project.bank.dao;

import com.project.bank.dto.Example;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExampleDao {
    Example getTestById(Integer id);

    Example getExampleById(Integer id);

    Example getUpdateById(Integer id);

    Example getAddById(Integer id, String name);
}
