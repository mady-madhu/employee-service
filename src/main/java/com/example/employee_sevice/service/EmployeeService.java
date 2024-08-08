package com.example.employee_sevice.service;

import com.example.employee_sevice.model.Employee;
import com.example.employee_sevice.repo.EmployeeRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private  EmployeeRepo employeeRepo;


    public Employee saveEmployee(Employee e){
        System.out.println("inside service"+employeeRepo);
        return employeeRepo.save(e);
    }
}
