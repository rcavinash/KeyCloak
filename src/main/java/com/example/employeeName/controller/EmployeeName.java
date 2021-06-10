package com.example.employeeName.controller;

import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;

@RestController
public class EmployeeName {

    @GetMapping("/employee")
    @RolesAllowed("user")
    public String employeeName() {
        return "Avinash";
    }
}