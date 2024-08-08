package com.example.employee_sevice.controller;


import com.example.employee_sevice.model.Employee;
import com.example.employee_sevice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e){
        System.out.println("inside controller"+employeeService);
        Employee saveEmployee = employeeService.saveEmployee(e);
        return  new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }
}
