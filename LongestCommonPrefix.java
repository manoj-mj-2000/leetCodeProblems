//$Id$
package com.leet;

public class LongestCommonPrefix {
	
	public static void main(String args[]) {
		
		String str[] = new String[] {"leetscode","leet","leeds","leads"};
		
		System.out.println(longestCommonPrefix(str));
	}
	
	// O(n) approach
	private static String longestCommonPrefix(String[] str) {
		
		if(str == null && str.length == 0) return "";
		
		String prefix = str[0];
		
		for(int i=1; i< str.length; i++) {
			while(!str[i].startsWith(prefix)) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty()) return "";
			}
		}
		
		return prefix;
	}
	
	
	// O(n * m) approach
	private static String longestCommonPrefix3(String[] str) {
		
		int minLen = str[0].length(); //to find minimum length of two strings
		int n = str.length;
		for(int i=0;i<n-1; i++) {
			String f = str[i];
			String s = str[i+1];
			
			int j=0;
			int min = Math.min(f.length(), s.length());
			while(j < min) {
				if(f.charAt(j) != s.charAt(j)) {
					break;
				}
//				if(j == minLen) {
//					break;
//				}
				j++;
			}
			minLen = Math.min(minLen, j);
		}
		
		
		return str[0].substring(0, minLen);
	}

	//Brute force approach
	private static String longestCommonPrefix2(String[] str) {
		
		if(str.length == 0)
			return "";
		
		int i;
		boolean flag = false;
		for(i=0; i<str[0].length(); i++) {
			if(flag)
				break;
			char c = str[0].charAt(i);
			for(int j=1;j<str.length; j++) {
				if(str[j].charAt(i) != c) {
					flag = true;
					break;
				}
			}
		}
		
		
		return str[0].substring(0,i-1);
	}
}
