package com.sneha.practice.leet;

import java.util.HashMap;

public class MatchingStrings {

	public static void main(String[] args) {
		 String str1 = "saamya";
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

	}

}
