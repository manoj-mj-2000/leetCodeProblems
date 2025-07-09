//$Id$
package com.leet;

import java.util.Arrays;

public class PermutationString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "ab", s2 = "eidbaooo";
		System.out.println( checkInclusion(s1, s2) );
	}

	public static boolean checkInclusion(String s1, String s2) {
    
		int n1=s1.length(), n2 = s2.length();
		
		if(n1 > n2)
			return false;
		
		int[] s1_count =  new int[26];
		int[] s2_count =  new int[26];
		
		for(int i=0;i<n1;i++) {
			s1_count[s1.charAt(i) - 'a'] += 1;
			s2_count[s2.charAt(i) - 'a'] += 1;
		}
		if(Arrays.equals(s1_count, s2_count)) {
			return true;
		}
		
		for(int i=n1; i<n2; i++) {
			s2_count[s2.charAt(i) - 'a'] += 1;
			s2_count[s2.charAt(i-n1) - 'a'] -= 1;
			if(Arrays.equals(s1_count, s2_count))
				return true;
		}
		
		return false;
    }
	
}
