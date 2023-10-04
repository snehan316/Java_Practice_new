package com.sneha.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EmployeeSorting {
	
	public static void main(String args[]) {

	Employee emp1 = new Employee(101, "John", "john@gmail.com");
	Employee emp2 = new Employee(104, "Max", "john@gmail.com");
	Employee emp3 = new Employee(102, "Arav", "john@gmail.com");
	Employee emp4 = new Employee(101, "Barny", "john@gmail.com");
	
	List<Employee> employees = new ArrayList<Employee>();
	
	employees.add(emp1);
	employees.add(emp2);
	employees.add(emp3);
	employees.add(emp4);
	
	Collections.sort(employees);
	
	Collections.sort(employees, new IDComparator());
	
	//Collections.sort(employees, new NameComparator());
	
	System.out.println(employees);
	
	}
	
	
}
