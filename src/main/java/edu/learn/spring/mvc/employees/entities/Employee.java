package edu.learn.spring.mvc.employees.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id
	private long id;
	@Column(name = "firstName")
	private String name;
	private double salary;
}