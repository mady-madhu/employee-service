package com.example.employee_service.config;


import com.example.employee_service.test.Address;
import com.example.employee_service.test.Department;
import com.example.employee_service.test.Employee;
import com.example.employee_service.test.Student;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

@Configuration
public class MyAppConfig {

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Student student(){
        Student s = new Student();
        s.setAddress(address());
        return s;
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Address address(){
        return new Address();
    }



    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Department department(){
        Department d = new Department();
        d.setEmployee(employee());
        return d;
    }

    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Employee employee(){
        Employee e = new Employee();
        return e;
    }




}
