package com.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Employee.Entity.Employee;
import com.Employee.repositary.EmployeeRepositary;

@SpringBootApplication
public class EmployeeManagementApplication implements CommandLineRunner {
	@Autowired
	private EmployeeRepositary employeeRepositary;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee e1 = Employee.builder().name("Nisha").email("n@gmail.com").department("IT").build();
		Employee e2 = Employee.builder().name("Baisali").email("b@gmail.com").department("Management").build();
		Employee e3 = Employee.builder().name("Sankho").email("s@gmail.com").department("CS").build();
		employeeRepositary.save(e1);
		employeeRepositary.save(e2);
		employeeRepositary.save(e3);
		System.out.println("-----All saved-----");

	}

}
