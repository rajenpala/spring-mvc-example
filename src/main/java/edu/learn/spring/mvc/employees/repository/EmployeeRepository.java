package edu.learn.spring.mvc.employees.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.learn.spring.mvc.employees.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Employee findByName(String name);
//	@Query(value = "FROM Employee where name=:name", nativeQuery = true)
//	Employee findByNameQuery(@Param("name") String name);
}


