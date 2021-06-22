package com.spring.swagger.controller;

import com.spring.swagger.dao.EmployeeRepository;
import com.spring.swagger.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// http://localhost:8080
@RestController
@RequestMapping("/api")
// http://localhost:8080/api
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // http://localhost:8080/api/save
    @PostMapping("/save")
    public void save(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }
    @GetMapping("/show")
    public Employee show(@RequestParam int id){
        return employeeRepository.findById((long) id).get();
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam int id){
        employeeRepository.deleteById((long) id);
    }
    @PutMapping("/edit")
    public void edit(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }

}
