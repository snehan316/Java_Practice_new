package com.sneha.practice.leet;

public class PermuteNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(4));
		System.out.println(permute(7,4));
	}
	
	static int permute(int n, int r) {
		
		int numerator = factorial(n);
		int denominator = factorial(n-r);
		
		int permuted = numerator/denominator;
		return permuted;
	}
	
	static int factorial(int n) {
		
		int fact = 1;
		if(n == 0) {
			return 1;
		}else {
			fact = n * factorial(n-1);
		}
		
		return fact;
	}

}
