//$Id$
package com.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParantheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "{}()[]";
		System.out.println( isValid(s) );
	}

	public static boolean isValid(String s) {
		
		Stack<Character> chars = new Stack<Character>();
 		Map<Character, Character> map = new HashMap();
 		map.put(')', '(');
 		map.put(']', '[');
 		map.put('}', '{'); 		
 		
		for(char c: s.toCharArray()) {
			if(!chars.isEmpty() && chars.peek() == map.get(c)) {
				chars.pop();
			}
			else {
				chars.push(c);
			}
		}
		
		return chars.isEmpty() ? true : false;
	}
}
