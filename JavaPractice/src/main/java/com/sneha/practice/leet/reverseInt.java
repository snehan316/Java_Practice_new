package com.sneha.practice.leet;

public class reverseInt {

	public static void main(String[] args) {
		reverseNum(123);	

	}

	static void reverseNum(int i) {
		
		int reverse = 0;
		while(i !=0) {
			int remainder = i % 10;
			reverse = reverse * 10 + remainder;
			i = i / 10;
		}
		
		System.out.println("Reverse of the Number is " + reverse);
		
	}
	
}

