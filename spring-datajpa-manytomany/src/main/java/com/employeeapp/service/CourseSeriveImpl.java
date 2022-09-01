package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Course;
import com.employeeapp.repository.ICourseRepository;

@Service
public class CourseSeriveImpl implements ICourseSerive {

	ICourseRepository courseRepository;

	@Autowired
	public void setCourseRepository(ICourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public void addCourse(Course course) {

		courseRepository.save(course);
	}

	@Override
	public void updateCourse(Course course) {

	}

	@Override
	public void deleteCourse(int courseId) {

	}

	@Override
	public List<Course> getAll() {
		return null;
	}

	@Override
	public Course getById(int courseId) {
		return null;
	}

	@Override
	public List<Course> getByCity(String city) {
		return null;
	}

	@Override
	public List<Course> getByCategory(String category) {
		return null;
	}

	@Override
	public List<Course> getByEmployee(String name) {
		return null;
	}

	@Override
	public List<Course> getByCourseCity(String course, String city) {
		return null;
	}

}
