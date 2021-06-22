package com.spring.swagger.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;

    private String fullName;

    private String age;

    private String phone;

    private String address;


}
