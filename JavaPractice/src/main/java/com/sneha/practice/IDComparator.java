package com.sneha.practice;

import java.util.Comparator;

public class IDComparator implements Comparator<Employee>{

	public int compare(Employee emp1, Employee emp2) {
		if(emp1.getId() == emp2.getId()) {
			return emp1.getName().compareTo(emp2.getName());
		}else if(emp1.getId() > emp2.getId()) {
			return 1;
		}else {
			return -1;
		}
	}
	
	

}
