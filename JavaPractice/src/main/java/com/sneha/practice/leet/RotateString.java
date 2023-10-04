package com.sneha.practice.leet;

public class RotateString {

	public static void main(String[] args) {
		
		String s = "ABCDEFG";
		System.out.println(leftRotate(s, 2)); //CDEFGAB
		System.out.println(rightRotate(s, 2));   //FGABCDE
		
		System.out.println(isRotation(s, "GFABCDE"));
		
		
		
		
	}
	
	static String leftRotate(String s, int d) {
		
		s = s.substring(d) + s.substring(0,d);
		return s;
	}
	
    static String rightRotate(String s, int d) {
		
		return leftRotate(s, s.length()-d);
	}
    
    static boolean isRotation(String s, String t) {
    	
    	String doubled = s + s;
    	if(doubled.indexOf(t) != -1) {
    		return true;
    	}
    	
    	return false;
    }

	
}


