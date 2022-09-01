package com.studentapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.studentapp.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Integer> {

	// Derived Querry
//	List<Student> findByDepartment(String department);
//	List<Student> findByAddressCity(String city);
//	List<Student> findByAddressCityAndDepartment(String city,String department);

	//Custom Querries- JPQL
	@Query("from Student s where s.department=?1")
	List<Student> findByDepartment(String department);
	
	@Query("from Student s inner join s.address a where a.city=?1")
	List<Student> findByAddressCity(String city);
	
	@Query("from Student s inner join s.address a where a.city=?1 and s.department=?2")
	List<Student> findByAddressCityAndDepartment(String city,String department);
	
	@Query("from Student s inner join s.address a where a.city=?1 and a.state=?2")
	List<Student> findByCityAndState(String city,String state);

}
