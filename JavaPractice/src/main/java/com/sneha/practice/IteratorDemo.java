package com.sneha.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {

	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		List<String> nameList = Arrays.asList("John", "Jane", "Max", "Arav");
		list.addAll(nameList);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			
		     if(iterator.next() == "Max") {
		    	 iterator.remove();
		     }
		}
		
		System.out.println(list);
		
		
//		for(String name: list) {
//			System.out.println(name);
//		}
//		
//		
		
	}
}
