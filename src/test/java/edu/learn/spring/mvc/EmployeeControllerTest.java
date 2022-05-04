package edu.learn.spring.mvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import edu.learn.spring.mvc.employees.controller.EmployeeController;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class EmployeeControllerTest {
	private static MockMvc mockMvc;
	
	@BeforeAll
	public static void setup() {
		mockMvc = MockMvcBuilders.standaloneSetup(new EmployeeController()).build();
	}
	
	@Test
	public void getRegistrationForm() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/register")).andExpect(status().isOk());
	}
}
