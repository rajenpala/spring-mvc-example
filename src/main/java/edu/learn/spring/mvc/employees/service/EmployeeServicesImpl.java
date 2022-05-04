package edu.learn.spring.mvc.employees.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.learn.spring.mvc.employees.entities.Employee;
import edu.learn.spring.mvc.employees.repository.EmployeeRepository;

@Service("service1")
public class EmployeeServicesImpl implements EmployeeServices {
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public Employee registerEmployee(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public Optional<Employee> getEmployee(long empId) {
		return empRepo.findById(empId);
	}

}
