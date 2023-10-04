package com.sneha.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeDataProcessing {

	public static void main(String[] args) {
		
		Employee employee = new Employee("Jane", "jane@company.com", 100, "SomeAddress");
		
		String fileName = "employeeDetails.txt";
		
		try {
			
			FileOutputStream fileOutStream = new FileOutputStream(fileName);
			ObjectOutputStream objectOutStream = new ObjectOutputStream(fileOutStream);
			
			objectOutStream.writeObject(employee);
			
			objectOutStream.close();
			fileOutStream.close();
			
			System.out.println("Serialization Done,  The Employee details are \n");
			displayObject(employee);
			
			employee.setSalary(200);
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		
		try {
			
			FileInputStream fileInStream = new FileInputStream(fileName);
			ObjectInputStream objectInStream = new ObjectInputStream(fileInStream);
			
			Employee emp = (Employee) objectInStream.readObject();
			
			System.out.println("Deserialization done. The employee details are: ");
			
			displayObject(emp);
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}
	
	
	
	
	
	public static void displayObject(Employee emp) {
		System.out.println("Name: " + emp.getName());
		System.out.println("Email: " + emp.getEmail());
		System.out.println("Salary: " + emp.getSalary());
		System.out.println("Address: " + emp.getAddress());
	}

}
