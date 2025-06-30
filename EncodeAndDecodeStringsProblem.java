//$Id$
package com.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStringsProblem {

	public static void main(String[] args) {
		
		List<String> in = new ArrayList(Arrays.asList("neet","code","love","you"));
		
		String enStr = encode(in);
		System.out.println(enStr);
		decode(enStr);
		 
	}

	public static String encode(List<String> strs) {
		StringBuilder sb = new StringBuilder();
		
		for(String str:strs)
			sb.append(str.length()).append('#').append(str);

		return sb.toString();
	}
	
	public static List<String> decode(String str) {
		
		List<String> strs = new ArrayList();
		
		int i=0;
		while(i<str.length()) {
			
			int j=i;
			while(str.charAt(j) != '#') {
				j++;
			}
			
			int len = Integer.parseInt(str.substring(i, j));
			i= j+1;
			j= i+len;
			strs.add( str.substring(i, j) );
			i = j;
		}
		
		return strs;
	}
}
