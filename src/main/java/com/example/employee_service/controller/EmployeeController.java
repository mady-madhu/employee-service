package com.example.employee_service.controller;


import com.example.employee_service.model.Employee;
import com.example.employee_service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("employee-service")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e){
        System.out.println("inside controller"+employeeService);
        Employee saveEmployee = employeeService.saveEmployee(e);
        return  new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }


    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer id){
        Employee getEmployee = employeeService.getEmployee(id);
        return  new ResponseEntity<>(getEmployee, HttpStatus.FOUND);
    }
}
