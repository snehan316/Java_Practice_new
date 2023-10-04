package com.sneha.practice;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee>{

	private static final long serialversionUID = 129348938L;
	
	private int id;
	private String name;
	private String email;
	private static int salary;
	private transient String address;
	
	
	public Employee() {
		
	}


	public Employee(String name, String email, int salary, String address) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}

	

	public Employee(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}


	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public static int getSalary() {
		return salary;
	}


	public static void setSalary(int salary) {
		Employee.salary = salary;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int compareTo(Employee emp) {
		if(this.id == emp.getId()) {
			return this.name.compareTo(emp.getName());
		}else if(this.id > emp.getId()){
			return 1;
		}else {
			return -1;
		}
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
	
	
	
	
	
}
