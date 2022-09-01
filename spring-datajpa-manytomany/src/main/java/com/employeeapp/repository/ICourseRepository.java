package com.employeeapp.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Course;

@Repository
public interface ICourseRepository extends JpaRepository<Course, Integer> {

	// derived
	Course findById(int courseId);

	List<Course> findByCategory(String category);

	// custome querry

	@Query("from Course c inner join employee e where e.name=?1")
	List<Course> findByEmployee(String name);

//	@Query("from Course c inner join employee e where e.=?1")
//	List<Course> findByCourseCity(String course, String city);
	
	@Query("from Course c inner join employee e where e.city=?1")
	List<Course> findByCity(String city);
}
