package com.sneha.practice.leet;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	public static void main(String[] args) {
		
		String input = "MCMXCIV";
		int ans =0;
		
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        for(int i=0; i< input.length(); i++) {
        	if(i <  input.length()-1 && map.get(input.charAt(i)) < map.get(input.charAt(i+1))){
        		
        		ans -= map.get(input.charAt(i));
        	}else {
        		ans += map.get(input.charAt(i));
        	}
        }

        System.out.println(ans);
	}

}
