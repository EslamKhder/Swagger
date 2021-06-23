package com.spring.swagger.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    @ApiModelProperty(value = "this is id of employee")
    private Long id;

    @ApiModelProperty(value = "this is Full Name of employee",required = false)
    private String fullName;

    private String age;

    private String phone;

    private String address;


}
