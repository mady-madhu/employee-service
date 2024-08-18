package com.example.employee_service.service;

import com.example.employee_service.entity.Address;
import com.example.employee_service.mapper.EmployeeMapper;
import com.example.employee_service.repo.AddressRepo;
import com.example.employee_service.repo.EmployeeRepo;
import com.example.employee_service.vo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private AddressRepo addressRepo;

    @Autowired
    private  EmployeeMapper employeeMapper;


    @Transactional
    public com.example.employee_service.vo.Employee saveEmployeeWithAddress(com.example.employee_service.vo.Employee e) {
        com.example.employee_service.entity.Employee employeeEntity = employeeMapper.EmployeeVoToEmployeeEntity(e);
        employeeEntity = employeeRepo.save(employeeEntity);
        Address addressEntity = employeeMapper.EmployeeVoToAddressEntity(e);
        addressEntity.setEmployee(employeeEntity);
        addressEntity = addressRepo.save(addressEntity);
        e.setEmpId(employeeEntity.getEmpId());
        e.getEmpAddress().setAddressId(addressEntity.getAddressId());

        return e;
    }

    @Transactional
    public com.example.employee_service.vo.Employee replaceEmployee(UUID eUuid,Employee employee) {
        com.example.employee_service.entity.Employee employeeEntity = employeeRepo.findById(eUuid).orElseThrow(()-> new IllegalArgumentException("No Employee"));
        employeeEntity.setEmpSalary(employee.getEmpSalary());
        employeeEntity.setEmpName(employee.getEmpName());
        employeeEntity = employeeRepo.save(employeeEntity);
        employeeMapper.EmployeeEntityToEmployeeVo(employeeEntity);
        return employeeMapper.EmployeeEntityToEmployeeVo(employeeEntity);
    }


    public  Employee getEmployee(UUID id){

        com.example.employee_service.entity.Employee e =  employeeRepo.findById(id)
                .orElseThrow(() ->  new IllegalArgumentException("No user found"));

        Employee vo = employeeMapper.EmployeeEntityToEmployeeVo(e);

        System.out.println("employee from DB::"+vo);
    return vo;
    }

    public void deleteEmployee(UUID id){
         employeeRepo.deleteById(id);
         return;
    }


/*
    public Employee getEmployeeByIdAndName(UUID id, String name){
        return employeeRepo.findById(id)
                .map(employee -> employee)
                .orElseThrow(() ->  new IllegalArgumentException("No user found"));
    }
*/
}
