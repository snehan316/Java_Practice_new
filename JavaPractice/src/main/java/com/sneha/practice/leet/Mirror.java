package com.sneha.practice.leet;

public class Mirror {
	
	public static void main(String[] args) {
		
		String S = "zaycb";
		String reverse = "zyxwvutsrsponmlkjihgfedcba";
		int count = 0;
		String res = "";
		String ans = "";
	
		
		for(int i =S.length() - 1; i>= 0; i--) {
			res = res + S.charAt(i);
		}
		
		System.out.println("Original String is " + S);
		System.out.println("Reversed String is " + res);
		
		
		for(int i =0; i < S.length(); i++) {
			ans = ans + reverse.charAt(S.charAt(i) - 'a');
		}

		System.out.println("Answer is " + ans);
		

		for(int i =0; i < S.length(); i++) {
			if(res.charAt(i) == ans.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
