package com.sneha.practice.Stream;

import java.util.Arrays;

public class LongestStringInArray {

	public static void main(String[] args) {
		
		String sArray[] = {"java", "spring", "microservices", "springboot"};
		
		String longestString = Arrays.asList(sArray).stream().reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2).get();
		System.out.println(longestString);

	}

}
