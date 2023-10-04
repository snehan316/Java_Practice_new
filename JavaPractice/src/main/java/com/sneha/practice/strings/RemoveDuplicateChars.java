package com.sneha.practice.strings;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicateChars {
	
	public static void main(String[] args) {
	
	String input = "javaisawesome";
	  
  List<Entry<String, Long>> list = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(s -> s.getValue() > 1).collect(Collectors.toList());
	
    for (Map.Entry<String, Long> entry : list) {
    	String s = entry.getKey();
    	if(input.contains(s)) {
    		input = input.replaceAll(s, "");
    	}
    }
    
    System.out.println(input);
    
    
   // LocalDate date = LocalDate.now().getYear()
	
	}
}
