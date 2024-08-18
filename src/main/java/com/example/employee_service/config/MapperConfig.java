package com.example.employee_service.config;

import com.example.employee_service.mapper.EmployeeMapper;
import com.example.employee_service.mapper.EmployeeMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public EmployeeMapper employeeMapper() {
        return new EmployeeMapperImpl();
    }
}
