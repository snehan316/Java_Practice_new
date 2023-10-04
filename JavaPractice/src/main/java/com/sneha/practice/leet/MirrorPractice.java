package com.sneha.practice.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MirrorPractice {

	public static void main(String[] args) {
		
		//zyxwvutsrsponmlkjihgfedcba
		
//		String S = "aazbyxc";
//		Map<Character, Character>  map = new HashMap<>();
//
//		char mirror = 'z';
//		for (char ch = 'a'; ch <= 'z'; ++ch){
//			map.put(ch, mirror--);
//	    }
//	
//		int count =0;
//		for(int i =0; i<S.length(); i++) {
//			for(int j =i; j < S.length(); j++) {
//				if(map.get(S.charAt(i)) == S.charAt(j)) {
//					count++;
//				}
//			}
//		}
//		
//		System.out.println(count);
		
		
		
		        String S = "wjlahohpec";
		        int[] count = new int[26]; // Initialize an array to store character counts.

		        for (char ch : S.toCharArray()) {
		            count[ch - 'a']++; // Increment the count for the character.
		        }

		        System.out.println(Arrays.toString(count));

		        int totalCount = 0;

		        for (char ch : S.toCharArray()) {
		            char mirror = (char) ('z' - (ch - 'a')); // Calculate the mirror character.
		            System.out.println(mirror);
		            totalCount += count[mirror - 'a']; // Add the count of the mirror character.
		        }

		        System.out.println(totalCount / 2); // Divide by 2 because each pair is counted twice.
		    
		

}

}