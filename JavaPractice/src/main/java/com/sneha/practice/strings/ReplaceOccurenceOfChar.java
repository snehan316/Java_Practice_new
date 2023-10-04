package com.sneha.practice.strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReplaceOccurenceOfChar {
	
	public static void main(String[] args) {
		
		String input = "javaisawesome";
		char charToReplace = 'a';
		
		if(input.indexOf(charToReplace) == -1) {
			System.out.println("Char not in string");
			System.exit(0);
		}
		
		int count = 1;
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if(ch == charToReplace) {
				input = input.replaceFirst(String.valueOf(ch), String.valueOf(count));
				count++;
			}
		}
		
		System.out.print(input);
	
	}
	
	

}
