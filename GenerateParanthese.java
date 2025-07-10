//$Id$
package com.leet;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParanthese {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		generateParenthesis(n);
	}

	public static List<String> generateParenthesis(int n) {
        
		List<String> res = new ArrayList();
		StringBuilder stack = new StringBuilder();
		backTrack(0,0, res, stack, n);
		return res;
    }

	private static void backTrack(int open, int close, List<String> res, StringBuilder stack, int n) {
		
		if(open == close && open == n)
			res.add(stack.toString());
		
		if(open < n) {
			stack.append("(");
			backTrack(open+1, close, res, stack, n);
			stack.deleteCharAt(stack.length() - 1);
		}
		if(close < open) {
			stack.append(")");
			backTrack(open, close+1, res, stack, n);
			stack.deleteCharAt(stack.length() - 1);
		}
		
	}
}
