//$Id$
package com.leet;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		String str = "0P";
		
		System.out.println(validPalindrome(str));
	}
	
	public static boolean validPalindrome(String s) {
		
		int l=0,r=s.length()-1;
		
		while(l< r) {
			while(l<r && !alphaNum(s.charAt(l))) {
				l++;
			}
			while(l<r && !alphaNum(s.charAt(r))) {
				r--;
			}
			if( Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)) ) {
				return false;
			}
			l++;r--;
		}
		
		return true;
	}

	private static boolean alphaNum(char c) {
		
		return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
	}

}
