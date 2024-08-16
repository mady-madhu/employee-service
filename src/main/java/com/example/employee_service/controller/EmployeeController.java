package com.example.employee_service.controller;


import com.example.employee_service.model.Employee;
import com.example.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("employee-service")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e){
        System.out.println("inside controller"+e);
        Employee saveEmployee = employeeService.saveEmployee(e);
        return  new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }


    //using PathVariable
    //default is required=true

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable(required = false) UUID id){
        Employee getEmployee = employeeService.getEmployee(id);
        return  new ResponseEntity<>(getEmployee, HttpStatus.FOUND);
    }




    //using Request param
    //default is required=false

    @GetMapping("/employee")
    public ResponseEntity<Employee> getEmployeeWithRequestParam(@RequestParam UUID id){
        Employee getEmployee = employeeService.getEmployee(id);
        return  new ResponseEntity<>(getEmployee, HttpStatus.FOUND);
    }


/*
    @GetMapping("/employee")
    public ResponseEntity<Employee> getEmployeeWithRequestParam(@RequestParam Integer id,@RequestParam String name){
        Employee getEmployee = employeeService.getEmployeeByIdAndName(id,name);
        return  new ResponseEntity<>(getEmployee, HttpStatus.FOUND);
    }
*/



}
