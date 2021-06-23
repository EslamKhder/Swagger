package com.spring.swagger.controller;

import com.spring.swagger.dao.EmployeeRepository;
import com.spring.swagger.model.Employee;
import io.swagger.annotations.Api;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// http://localhost:8080
@Api(value = "this is employee controller",description = "Controller Layer")
@Tag(name = "Employee Controller Layer")
@RestController
@RequestMapping("/api")
// http://localhost:8080/api
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // http://localhost:8080/api/save
    @PostMapping("/save")
    @Tag(name = "Employee Controller Layer")
    public void save(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }
    @GetMapping("/show")
    @Tag(name = "Emplyee Controller Layer")
    public Employee show(@RequestParam int id){
        return employeeRepository.findById((long) id).get();
    }
    @DeleteMapping("/delete")
    @Tag(name = "Emplyee Controller Layer")
    public void delete(@RequestParam int id){
        employeeRepository.deleteById((long) id);
    }
    @PutMapping("/edit")
    @Tag(name = "Emplyee Controller Layer")
    public void edit(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }

}
