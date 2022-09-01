package com.employeeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Course;
import com.employeeapp.model.Employee;
import com.employeeapp.service.ICourseSerive;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}

	IEmployeeService employeeService;
	@Autowired
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	ICourseSerive courseService;
	@Autowired
	public void setCourseService(ICourseSerive courseService) {
		this.courseService = courseService;
	}

	@Override
	public void run(String... args) throws Exception {

//		Employee employee = new Employee("Akhil Toitode", "Hyderabad", "JD");
//		Course jcourse = new Course("Java", 50, "Full Stack");
//		Course pycourse = new Course("Python", 50, "Full Stack");
//		Course scourse = new Course("Spring", 50, "Full Stack");
//
//		Set<Course> courseList = new HashSet<>(Arrays.asList(jcourse, pycourse, scourse));
		
		
		//employee.setCourses(courseList);
		//employeeService.addEmployee(employee);
		
		Employee employee2=new Employee("Rahul Patil", "Bangalore", "Digital");
		Course jcourse=courseService.getById(1);
		Course scourse=courseService.getById(2);
		
		
		Set<Course> courseList = new HashSet<>(Arrays.asList(jcourse, scourse));
		employee2.setCourses(courseList);
		employeeService.addEmployee(employee2);
//		
//		Employee employee4=new Employee("Kiran Desai", "Hyderabad", "Backend");
		
		

		
	}

}
