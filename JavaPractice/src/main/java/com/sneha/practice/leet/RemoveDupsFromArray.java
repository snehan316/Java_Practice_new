package com.sneha.practice.leet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDupsFromArray {

	public static void main(String[] args) {
		
		int[] myArray = {1,3,4,2,1,4,5,2,2};
		int[] newArray = new int[myArray.length];
		
		
	List<Entry<Integer, Long>> list =	Arrays.stream(myArray).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().filter(i -> i.getValue() <=1).collect(Collectors.toList());

	int i =0;
    for(Map.Entry<Integer, Long> entry: list) {
    	 	
    	System.out.println(("Unique elements are: " + entry.getKey()));
    	newArray[i++] = entry.getKey();
    	
    }
    
    System.out.println(Arrays.toString(newArray));
	
	}
	
	

}
