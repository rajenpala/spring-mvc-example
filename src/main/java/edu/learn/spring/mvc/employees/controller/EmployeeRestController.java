package edu.learn.spring.mvc.employees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.learn.spring.mvc.employees.entities.Employee;
import edu.learn.spring.mvc.employees.service.EmployeeServices;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeServices empServices;
	
	@PostMapping("/employees/register")
	public Employee registerEmployee(@RequestBody Employee employee) {
		return empServices.registerEmployee(employee);
	}
}
