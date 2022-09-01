package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Employee;

public interface IEmployeeService {

	Employee addEmployee(Employee employee);
	void updateEmployee(Employee employee);
	void deleteEmployee(int employeeId);
	List<Employee> getAll();
	Employee getById(int employeeId);
	
	
	//Derived Querry
	List<Employee> getByCity(String city);
	
	//Customed Querry
	List<Employee> getByCourseName(String courseName);
	
}
