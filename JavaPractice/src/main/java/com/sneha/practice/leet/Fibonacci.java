package com.sneha.practice.leet;

import java.util.Arrays;

class Fibonacci {

	public static void main(String args[])
	{
		int[] fibArray = fib(5);
		int sum = fibSum(fibArray);
		System.out.println(sum);
		
		
		
	}
	
	
	static int[] fib(int terms) {
		
		int[] fibArray = new int[terms];
		
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		
		for(int i = 2; i < terms; i++) {
			fibArray[i] = fibArray[i-1] + fibArray[i-2]; 
		}
		
		System.out.println(Arrays.toString(fibArray));
		return fibArray;
 		
	}
	
	static int fibSum(int[] fibArray) {
		
		int sum = 0;
		for(int i =0; i < fibArray.length; i++) {
			sum += fibArray[i];
		}
		
		return sum;
	}
	
	
}
