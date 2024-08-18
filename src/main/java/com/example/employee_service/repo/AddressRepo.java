package com.example.employee_service.repo;

import com.example.employee_service.entity.Address;
import com.example.employee_service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepo extends JpaRepository<Address, UUID> {
}
