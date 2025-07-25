//$Id$
package com.leet;

import java.util.HashMap;
import java.util.Map.Entry;

public class IsAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "car";
		String t = "rac";
		
		System.out.println(isAnagram(s,t));
	}
	
	public static boolean isAnagram(String s, String t) {
		int sLen = s.length();
        	int tLen = t.length();
		if(sLen != tLen)
			return false;
		int count[] = new int[26];
		for(int i=0;i<sLen; i++) {
			count[s.charAt(i) - 'a']++;
			count[t.charAt(i) - 'a']--;
		}
		
		for(int i=0;i<count.length;i++) {
			if(count[i] != 0)
				return false;
		}
		return true;
		
	}

}
