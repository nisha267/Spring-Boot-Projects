package com.Employee.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.Employee.Entity.Employee;

@Component
public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getAllEmployees();

	Employee getAEmployee(long id);

	Employee update(Employee employee, long id);

	String delete(long id);
}
