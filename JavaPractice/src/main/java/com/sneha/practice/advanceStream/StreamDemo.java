package com.sneha.practice.advanceStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();


		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
	
		
		//How many male and female employees are there in the organization?
		Map<String, Long> maleAndFemaleEmployeeCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(maleAndFemaleEmployeeCount);
		System.out.println("*".repeat(100));
	   
	    // Print the name of all departments in the organization?
		employeeList.stream().map(emp -> emp.getDept()).distinct().forEach(System.out::println);
		System.out.println("*".repeat(100));
		
		//What is the average age of male and female employees?
		System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));
	  	System.out.println("i".repeat(100));
	    

		//What is the highest salary of a male and female employee?
	  	System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.maxBy(Comparator.comparing(Employee::getSalary)))));
	  	System.out.println("j".repeat(100));
	  	
	    //Get the details of highest paid employee in the organization?
	    System.out.println(employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
	    System.out.println("*".repeat(100));
	
	    //Get the names of all employees who have joined after 2015?
	    employeeList.stream().filter(emp -> emp.getYearOfJoining() > 2015).map(emp -> emp.getName()).forEach(System.out::println);
	    System.out.println("*".repeat(100));
	    
	    // Query 6 : Count the number of employees in each department?
	    System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting())));
	    System.out.println("*".repeat(100));
	    
	 // Query 7 : What is the average salary of each department?
	    System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary))));
	    System.out.println("*".repeat(100));
	    
	 // Query 8 : Get the details of youngest male employee in the product
	    System.out.println(employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge))));
	    System.out.println("*".repeat(100));
	    
	 // Query 9 : Who has the most working experience in the organization?
	    System.out.println(employeeList.stream().collect(Collectors.minBy(Comparator.comparingInt(Employee::getYearOfJoining))).map(emp -> emp.getName()));
	    System.out.println("*".repeat(100));
	    
	  // Qyery 10: How many male and female employees are there in the sales and marketing team
	    System.out.println(employeeList.stream().filter(e -> e.getDept().equalsIgnoreCase("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
	    System.out.println("*".repeat(100));
	    
	 // Query 11 : What is the average salary of male and female employees?
	    System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary))));
	    
	    
	 // Query 12 : List down the names of all employees in each department?
	  Map<String, List<Employee>> map = employeeList.stream().collect(Collectors.groupingBy(Employee::getDept));
	   
	   
	   List<Employee> empByDeptList = new ArrayList<>();
	   for(Map.Entry<String, List<Employee>> entry: map.entrySet()) {
		   empByDeptList.addAll(entry.getValue());
		   
		   System.out.println(entry.getKey() + ":");
		   
		   for(Employee e : empByDeptList) {
			   System.out.println(e.getName());
		   }
 	   }
	   
	   
	 // Query 13 : What is the average salary and total salary of the whole organisation
	   System.out.println("*".repeat(100));
	  System.out.println(employeeList.stream().collect(Collectors.averagingDouble(Employee::getSalary)));
	  System.out.println(employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)).getSum());
	  
	    
	    
	 // Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
	 Map<Boolean, List<Employee>> map1 =  employeeList.stream().collect(Collectors.partitioningBy(emp -> emp.getAge() <= 25));
	 
	 for(Map.Entry<Boolean, List<Employee>> entry: map1.entrySet()) {
		 if(entry.getKey()) {
			 System.out.println("employees who are younger or equal to 25");
		 }else {
			 System.out.println("employees who are older or equal to 25");
		 }
		 
		 List<Employee> list = entry.getValue();
		 
		 for(Employee e : list) {
			 System.out.println(e.getName());
		 }
	 }
	    
	 // Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
	 Optional<Employee> emps = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
	 System.out.println(emps.get().getName() + emps.get().getAge() + emps.get().getDept());
	
	}

	
}
