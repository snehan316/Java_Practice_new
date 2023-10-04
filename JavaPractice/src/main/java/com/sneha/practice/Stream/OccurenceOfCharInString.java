package com.sneha.practice.Stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharInString {
	
	public static void main(String[] args) {
		
    String input = "ilovejavaprogramming";
    
    
    //Occurence of Character
    Map<String, Long> occurenceMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    System.out.println(occurenceMap);
    
	//**************************************************************************
    
    
    //Duplicate Characters
	List<String> duplicateStrings = occurenceMap.entrySet().stream().filter(x-> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
	System.out.println(duplicateStrings);

	
	//**************************************************************************
	//Unique Characters
	List<String> uniqueElements = occurenceMap.entrySet().stream().filter(x-> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
	System.out.println(uniqueElements); 
	
	
	//**************************************************************************
	//first non repeat character
	 Map<String, Long> occurenceLinkedHashMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
	 String firstNonRepeatCharacter = occurenceLinkedHashMap.entrySet().stream().filter(x -> x.getValue() ==1).findFirst().get().getKey();
	 System.out.println(firstNonRepeatCharacter);	
		
    
		
		
	
	}
}
