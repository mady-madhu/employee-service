package com.example.employee_service.controller;


import com.example.employee_service.service.EmployeeService;
import com.example.employee_service.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("employee-service")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e){
        System.out.println("inside controller"+e);
        Employee saveEmployee = employeeService.saveEmployeeWithAddress(e);
        return  new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);
    }


    //using PathVariable
    //default is required=true
    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable(required = true) UUID id){
        Employee getEmployee = employeeService.getEmployee(id);
        return  new ResponseEntity<>(getEmployee, HttpStatus.FOUND);
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity<Optional<Void>> deleteEmployee(@PathVariable(required = true) UUID id){
       employeeService.deleteEmployee(id);
        return  new ResponseEntity<>(Optional.empty(), HttpStatus.OK);
    }

    @PutMapping("/employee/{id}")
    public ResponseEntity<Employee> replaceEmployeeDetails(@PathVariable UUID id,@RequestBody Employee employee){
        Employee getEmployee = employeeService.replaceEmployee(id,employee);
        return  new ResponseEntity<>(getEmployee, HttpStatus.OK);
    }



/*    @PatchMapping("/employee")
    public ResponseEntity<Employee> getEmployeeWithRequestParam(@RequestParam Integer id,@RequestParam String name){
        Employee getEmployee = employeeService.getEmployeeByIdAndName(id,name);
        return  new ResponseEntity<>(getEmployee, HttpStatus.FOUND);
    }*/




}
