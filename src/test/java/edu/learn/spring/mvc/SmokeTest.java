package edu.learn.spring.mvc;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.learn.spring.mvc.employees.controller.EmployeeController;

@SpringBootTest
public class SmokeTest {
	@Autowired
	private EmployeeController empController;
	
	@Test
	public void checkEmpController() {
		assertThat(empController).isNotNull();
	}
}
