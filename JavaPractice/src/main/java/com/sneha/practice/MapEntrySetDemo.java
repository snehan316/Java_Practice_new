package com.sneha.practice;

import java.util.HashMap;
import java.util.Map;

public class MapEntrySetDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "John");
		map.put(2, "Jane");
		map.put(3, "Max");
		map.put(4, "Arav");
	
//		for(Map.Entry<Integer, String> item : map.entrySet()) {
//			//System.out.println(item);
//			System.out.println(item.getValue());
//		}
		
		map.forEach((key, value) -> System.out.println(value));
		
	}
}
