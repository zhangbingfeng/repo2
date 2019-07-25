package com.project.bank.controller;

import com.project.bank.dto.Example;
import com.project.bank.service.ExampleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(value = "样例模块", description = "基础样例的接口信息")
public class ExampleController {
    @Autowired
    ExampleService exampleService;

    @GetMapping("/Example/{id}")
    @ApiOperation(value = "获取用户信息", notes = "根据ID查询用户信息")
    @ApiImplicitParam(value = "用户的ID", paramType = "path")
    public Example select(@PathVariable("id") Integer id) {
        Example result = exampleService.getTestById(id);
        return result;
    }

    @ApiOperation(value = "添加用户", notes = "根据传入的用户信息添加用户")
    @ApiImplicitParam(value = "用户对象", paramType = "query")
    @PostMapping("/Example/adduser")
    public Example add(Integer id, String name) {
        Example res3 = exampleService.getAddById(id, name);
        return res3;
    }

    @ApiOperation(value = "删除用户", notes = "根据传入的用户ID删除用户")
    @ApiImplicitParam(value = "用户的ID", paramType = "path")
    @DeleteMapping("Example/deleteuser")
    public Example delete(Integer id) {
        return exampleService.getExampleById(id);
    }
}
