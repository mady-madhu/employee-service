package com.example.employee_service.service;

import com.example.employee_service.model.Employee;
import com.example.employee_service.repo.EmployeeRepo;
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

    public Employee getEmployee(Integer id){
        return employeeRepo.findById(id)
                .map(employee -> employee)
                .orElseThrow(() ->  new IllegalArgumentException("No user found"));
    }
}
