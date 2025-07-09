//$Id$
package com.leet;

import java.util.HashMap;

public class MinimumWindowSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "xyz", t = "xyz";
		
		System.out.println(minWindow(s,t));
	}

	public static String minWindow(String s, String t) {
        
		if(t.isEmpty())
			return "";
		
		HashMap<Character, Integer> countT = new HashMap(); 
		HashMap<Character, Integer> window = new HashMap();
		for(char c : t.toCharArray()) {
			countT.put(c, countT.getOrDefault(c, 0) + 1);
		}
		
		int have=0, need = countT.size();
		int res[] = {-1,-1};
		int resLen = Integer.MAX_VALUE, l=0, n=s.length();
		
		for(int r=0;r<n;r++) {
			char c = s.charAt(r);
			window.put(c, window.getOrDefault(c, 0) + 1);
			
			if(countT.containsKey(c) && window.get(c).equals(countT.get(c))) {
				have++;
			}
			
			while(have == need) {
				
				if((r-l + 1) < resLen) {
					resLen = r-l+1;
					res[0] = l;
					res[1] = r;
				}
				
				char leftChar = s.charAt(l);
				window.put(leftChar, window.getOrDefault(leftChar, 0) - 1);
				if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)) {
					have--;
				}
				l++;
			}
			
		}
		
		return resLen == Integer.MAX_VALUE ? "" : s.substring(res[0], res[1] + 1);
		
    }
}
