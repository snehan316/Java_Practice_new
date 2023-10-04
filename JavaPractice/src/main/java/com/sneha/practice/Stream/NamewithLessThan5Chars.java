package com.sneha.practice.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.NameList;

public class NamewithLessThan5Chars {
	
	public static void main(String[] args) {

	List<String> names = Arrays.asList("Johnny", "Jane", "Max", "Arav");
	List<String> nameList = new ArrayList<>();
	nameList.addAll(names);
	
	List<String> shortNames = nameList.stream().filter((name) -> name.length() <5).collect(Collectors.toList());
	
	System.out.println(nameList);
	System.out.println("*".repeat(100));
	System.out.println(shortNames);
	
}
	
}
