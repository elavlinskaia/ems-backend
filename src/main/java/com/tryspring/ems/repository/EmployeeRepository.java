package com.tryspring.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tryspring.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
