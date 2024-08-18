package com.example.employee_service.mapper;

import com.example.employee_service.entity.Address;
import com.example.employee_service.entity.Employee;

public class EmployeeMapperImpl implements EmployeeMapper{
    @Override
    public Employee EmployeeVoToEmployeeEntity(com.example.employee_service.vo.Employee vo) {
        com.example.employee_service.entity.Employee entity = new com.example.employee_service.entity.Employee();
        entity.setEmpName(vo.getEmpName());
        entity.setEmpSalary(vo.getEmpSalary());
        return entity;
    }

    @Override
    public Address EmployeeVoToAddressEntity(com.example.employee_service.vo.Employee vo) {
        Address addressEntity = new Address();
        addressEntity.setState(vo.getEmpAddress().getState());
        addressEntity.setCity(vo.getEmpAddress().getCity());
        addressEntity.setCountry(vo.getEmpAddress().getCountry());
        addressEntity.setStreet(vo.getEmpAddress().getStreet());
        return addressEntity;
    }


    @Override
    public com.example.employee_service.vo.Employee EmployeeEntityToEmployeeVo(Employee entity) {

        com.example.employee_service.vo.Employee vo = new com.example.employee_service.vo.Employee();
        vo.setEmpName(entity.getEmpName());
        vo.setEmpSalary(entity.getEmpSalary());
        vo.setEmpId(entity.getEmpId());
        com.example.employee_service.vo.Address addVo = new com.example.employee_service.vo.Address();
        addVo.setAddressId(entity.getEmpAddress().getAddressId());
        addVo.setState(entity.getEmpAddress().getState());
        addVo.setCity(entity.getEmpAddress().getCity());
        addVo.setCountry(entity.getEmpAddress().getCountry());
        addVo.setStreet(entity.getEmpAddress().getStreet());

        vo.setEmpAddress(addVo);
        return vo;
    }



}
