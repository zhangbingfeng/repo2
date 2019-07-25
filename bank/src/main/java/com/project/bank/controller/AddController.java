package com.project.bank.controller;

import com.project.bank.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    @Autowired
    ExampleService exampleService;
}
