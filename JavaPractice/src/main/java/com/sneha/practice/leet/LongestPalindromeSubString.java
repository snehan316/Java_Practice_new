package com.sneha.practice.leet;

public class LongestPalindromeSubString {

	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("bananas"));
		System.out.println(longestPalindrome("babad"));
		System.out.println(longestPalindrome("ac"));
		System.out.println(longestPalindrome("cbbd"));

	}
	
	static String longestPalindrome(String s) {
		
		int start = 0;
		int subLen = 0;
		
		for(int i=0; i < s.length(); i++) {
			int len1 = expandAroundCenter(s , i, i);
			int len2 = expandAroundCenter(s, i, i+1);
			int len = Math.max(len1, len2);
			if(len > subLen) {
				subLen = len;
				start = i - (len-1)/2;
			}
		}
		
		return s.substring(start, start+subLen);
		
	}
	
	private static int expandAroundCenter(String s, int left, int right) {
		
		
		while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}
		
		return right - left -1;
	}

}
