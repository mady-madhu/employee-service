package com.example.employee_service.vo;


import com.example.employee_service.entity.Employee;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address implements Serializable {


    private UUID addressId;
    private String city;
    private String street;
    private  String state;
    private String country;
    private Employee employee;
}
