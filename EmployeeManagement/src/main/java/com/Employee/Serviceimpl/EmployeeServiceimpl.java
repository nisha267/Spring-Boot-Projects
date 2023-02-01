package com.Employee.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Entity.Employee;
import com.Employee.repositary.EmployeeRepositary;
import com.Employee.service.EmployeeService;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	@Autowired
	private EmployeeRepositary employeeRepositary;

	@Override
	public Employee createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepositary.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepositary.findAll();
	}

	@Override
	public Employee getAEmployee(long id) {
		// TODO Auto-generated method stub
		return employeeRepositary.findById(id).get();
	}

	@Override
	public Employee update(Employee employee, long id) {
		// TODO Auto-generated method stub
		Employee _employee = employeeRepositary.findById(id).get();
		_employee.setName(employee.getName());
		_employee.setEmail(employee.getEmail());
		;
		return employeeRepositary.save(_employee);
	}

	@Override
	public String delete(long id) {
		// TODO Auto-generated method stub
		employeeRepositary.deleteById(id);
		return "The employee with id" + id + "has been deleted!!";
	}

}
