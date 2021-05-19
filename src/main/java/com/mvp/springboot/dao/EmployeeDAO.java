package com.mvp.springboot.dao;

import org.springframework.stereotype.Repository;

import com.mvp.springboot.model.Employee;
import com.mvp.springboot.model.Employees;

@Repository
public class EmployeeDAO {

	private static Employees employees = new Employees();

	static {
		employees.getEmployees().add(new Employee(1, "Lokesh", "Gupta", "howtodoinjava@gmail.com"));
		employees.getEmployees().add(new Employee(2, "Alex", "Kolenchiskey", "abc@gmail.com"));
		employees.getEmployees().add(new Employee(3, "David", "Kameron", "titanic@gmail.com"));
	}
	
	public Employees getAllEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		employees.getEmployees().add(employee);
	}
}