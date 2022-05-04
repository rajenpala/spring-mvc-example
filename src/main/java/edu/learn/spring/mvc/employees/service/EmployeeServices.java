package edu.learn.spring.mvc.employees.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.learn.spring.mvc.employees.entities.Employee;

@Service
public interface EmployeeServices {
	Employee registerEmployee(Employee emp);
	Optional<Employee> getEmployee(long empId);
}
