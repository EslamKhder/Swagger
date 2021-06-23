package com.spring.swagger.controller;

import com.spring.swagger.dao.EmployeeRepository;
import com.spring.swagger.model.Employee;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// http://localhost:8080
//@Api(value = "this is  Player Controller",description = "Controller Player Layer")
@Tag(name = "Player Controller Layer",description = "Controller Player Layer")
@RestController
@RequestMapping("/api")
// http://localhost:8080/api
public class PlayerController {

    @GetMapping("/name")
    @Tag(name = "Player Controller Layer")
    public String getName(){
        return "Eslam Khder";
    }

    @GetMapping("/student")
    @Tag(name = "Employee Controller Layer")
    public String getStudent(){
        return "I am Stident (Eslam Khder)";
    }


}
