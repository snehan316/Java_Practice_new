package com.sneha.practice.advanceStream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private int yearOfJoining;
	private double salary;
}
