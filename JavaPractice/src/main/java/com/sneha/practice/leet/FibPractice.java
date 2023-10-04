package com.sneha.practice.leet;

public class FibPractice {
	
	public static void main(String args[])
	{
		int sum = fib(5);
		System.out.println(sum);
	}
	
	static int fib(int terms) {
		
		
		int[] fibArray = new int[terms];
		fibArray[0] = 0;
		fibArray[1] = 1;
		
		int sum = 1;
			
		if(terms <= 1) {
			return sum;
		}else {
			for(int i =2; i < terms; i++) {
				fibArray[i] = fibArray[i-1] + fibArray[i-2];
				sum += fibArray[i];
			}
			
			return sum;
		}
	}

}
