package com.sneha.practice.Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class HighestNumbersStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {5, 9, 11, 2, 8, 21, 1};
		
		//second highest number
		Integer secondHighestNumber =Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondHighestNumber);

		
	}

}
