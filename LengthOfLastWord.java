//$Id$
package com.leet;

public class LengthOfLastWord {

	public static void main(String[] args) {
		
		String s = "Helo world  ";
		int l = lengthOfLastWord(s);
		System.out.println(l);
	}
	
	public static int lengthOfLastWord(String s) {
		int c=0;
		s = s.trim();
		for(char ch : s.trim().toCharArray()) {
			if(ch != ' ')
				c++;
			else 
				c = 0;
		}
		
		return c;
	}
}
