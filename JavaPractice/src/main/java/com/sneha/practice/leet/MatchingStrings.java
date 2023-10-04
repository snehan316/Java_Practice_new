package com.sneha.practice.leet;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchingStrings {

	public static void main(String[] args) {
		 String str1 = "saamyazzi";
	     String str2 = "samaya";
	     
	     char[] arr = str1.toCharArray();
	     char[] arr2 = str2.toCharArray();
	     HashMap<Character,Integer> hMap = new HashMap<>();
	     HashMap<Character,Integer> hMap2 = new HashMap<>();
	     
	     for(int i=0; i< arr.length; i++) {
	    	 if(!hMap.containsKey(arr[i])) {
	    		 hMap.put(arr[i], i);
	    	 }
	     }
	    
	     for(int i=0; i< arr2.length; i++) {
	    	 if(hMap.containsKey(arr2[i])) {
	    		 hMap2.put(arr2[i], i);
	    	 }
	     }
	     
	     System.out.println(hMap2.size());
	     
	     char[]  matches = new char[hMap2.size()];
	     int y=0;
	     for(Map.Entry<Character, Integer> entry : hMap2.entrySet()) {
	    	 matches[y++] = entry.getKey();
	     }
	     
	     System.out.println(matches[0]);

	    for(int i=0; i < str1.length() - 1; i++) {
	    	for(int j =0; j < matches.length; j++) {
	    		if(str1.charAt(i) == matches[j]) {
	    			str1 = str1.replace(str1.charAt(i), '\0');
	    		}
	    	}
	    }
	    
	    System.out.println(str1.trim());
	

	}
}
