package edu.learn.spring.mvc.employees.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import edu.learn.spring.mvc.employees.entities.Employee;
import edu.learn.spring.mvc.employees.service.EmployeeServices;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeServices empService;
	
	@GetMapping("/register")
	public String getRegistrationForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "register-form";
	}
	
	@PostMapping("/register")
	public String registerEmployee(@ModelAttribute Employee employee, Model model) {
		Employee registeredEmployee = empService.registerEmployee(employee);
		model.addAttribute("employee", registeredEmployee);
		return "result-page";
	}
}
