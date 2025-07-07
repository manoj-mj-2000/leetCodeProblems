//$Id$
package com.leet;

import java.util.HashSet;

public class LongestSubStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pwwkew";
		int re=lengthOfLongestSubstring(s);
		System.out.println(re);
	}

	public static int lengthOfLongestSubstring(String s) {
        
		HashSet<Character> set = new HashSet();
		
		int res=0, l=0;
		for(int i=0;i<s.length();i++) {
			while(set.contains(s.charAt(i))) {
				set.remove(s.charAt(l));
				l+=1;
			}
			set.add(s.charAt(i));
			res = Math.max(res, i - l+1);
		}
		
		return res;
    }
}
