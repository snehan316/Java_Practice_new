package com.sneha.practice.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementStartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {5, 9, 11, 2, 8, 21, 1};
		
		List<String> numberList = Arrays.stream(numbers).boxed().map(s -> s + "").filter(s -> s.startsWith("1")).collect(Collectors.toList());
		System.out.println(numberList);
		
		
		String sArray[] = {"java", "spring", "microservices", "springboot"};
		
		List<String> stringList = Arrays.stream(sArray).filter(s-> s.startsWith("s")).collect(Collectors.toList());
		System.out.println(stringList);
	}
}
