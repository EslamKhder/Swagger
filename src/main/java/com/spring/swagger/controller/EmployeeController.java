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

import javax.swing.text.html.parser.Entity;

// http://localhost:8080
@Api(value = "this is employee controller",description = "Controller Layer")
@Tag(name = "Employee Controller Layer",description = "Controller Layer")
@RestController
@RequestMapping("/api")
// http://localhost:8080/api
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // http://localhost:8080/api/save
    @PostMapping("/save")
    @Operation(description = "save Employee",summary = "save Employee",
                tags = "Employee Controller Layer",
                responses = {
                    @ApiResponse(responseCode = "201",description = "Created")
            })
    public ResponseEntity<Employee> save(@RequestBody Employee employee){
        return ResponseEntity.status(HttpStatus.CREATED).body(
                employeeRepository.save(employee)
        );
    }
    @GetMapping("/show")
    @Operation(description = "show Employee",summary = "show Employee",
            tags = "Employee Controller Layer",
            responses = {
                    @ApiResponse(responseCode = "200",description = "Success")
            })
    public ResponseEntity<Employee> show(@RequestParam int id){
        return ResponseEntity.status(HttpStatus.OK).body(
                employeeRepository.findById((long) id).get()
        );
    }
    @DeleteMapping("/delete")
    @Operation(description = "delete Employee",summary = "delete Employee",
            tags = "Employee Controller Layer",
            responses = {
                    @ApiResponse(responseCode = "200",description = "Success")
            })
    public void delete(@RequestParam int id){
        employeeRepository.deleteById((long) id);
    }
    @PutMapping("/edit")
    @Operation(description = "edit Employee",summary = "edit Employee",
            tags = "Employee Controller Layer",
            responses = {
                    @ApiResponse(responseCode = "200",description = "Ok")
            })
    public void edit(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }

}
