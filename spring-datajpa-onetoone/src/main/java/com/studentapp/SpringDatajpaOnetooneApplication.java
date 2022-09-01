package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}

	IStudentService studentService;
	
	@Autowired
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}


	@Override
	public void run(String... args) throws Exception {
		Address addressNikhil=new Address("Belgavi", "Karnataka");
//		Student student=new Student("Abhishek Dodawad", "CS Engineering", addressNikhil);
//		studentService.addStudent(student);
		
		
		studentService.getByCity("Haliyal").forEach(System.out::println);
		System.out.println();
		studentService.getByCityAndDepartment("Belgavi", "CS Engineering").forEach(System.out::println);
		System.out.println();
		studentService.getByDepartment("CS Engineering").forEach(System.out::println);
		
	}

}
