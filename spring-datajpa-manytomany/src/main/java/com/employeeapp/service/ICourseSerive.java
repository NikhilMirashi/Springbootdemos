package com.employeeapp.service;

import java.util.List;

import com.employeeapp.model.Course;

public interface ICourseSerive {
	
	void addCourse(Course course);
	void updateCourse(Course course);
	void deleteCourse(int courseId);
	List<Course> getAll();
	
	
	//derived
	Course getById(int courseId);
	List<Course> getByCity(String city);
	List<Course> getByCategory(String category);
	
	
	//custome querry
	List<Course> getByEmployee(String name);
	List<Course> getByCourseCity(String course,String city);
	
	

}
