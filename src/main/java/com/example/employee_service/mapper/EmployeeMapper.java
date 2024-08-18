package com.example.employee_service.mapper;


import com.example.employee_service.entity.Address;
import com.example.employee_service.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper employeeMapper = Mappers.getMapper(EmployeeMapper.class);

    Employee EmployeeVoToEmployeeEntity(com.example.employee_service.vo.Employee vo);

    Address EmployeeVoToAddressEntity(com.example.employee_service.vo.Employee vo);

    com.example.employee_service.vo.Employee EmployeeEntityToEmployeeVo(Employee entity);


}
