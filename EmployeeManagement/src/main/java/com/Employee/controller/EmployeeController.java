package com.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee")
	public List<Employee> getCAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@GetMapping("/employee/{id}")
	public Employee getCAEmployees(@PathVariable long id) {
		return employeeService.getAEmployee(id);
	}

	@PostMapping("/employee")
	public Employee createNewEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}

	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable long id, @RequestBody Employee employee) {
		return employeeService.update(employee, id);
	}

	@DeleteMapping("/employee/{id}")
	public String deleteCEmployee(@PathVariable long id) {
		return employeeService.delete(id);
	}
}
