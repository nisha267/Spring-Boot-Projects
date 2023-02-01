package com.Employee.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Employee.Entity.Employee;

public interface EmployeeRepositary extends JpaRepository<Employee, Long> {

}
