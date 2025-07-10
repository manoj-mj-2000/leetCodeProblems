//$Id$
package com.leet;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"1","2","+","3","*","4","-"};
		System.out.println(evalRPN(arr));
	}
	
	public static int evalRPN(String[] tokens) {

        Stack<Integer> nums = new Stack();
        
        for(String s : tokens) {
        	if(s.equals("+")) {
        		int a = nums.pop();
        		int b = nums.pop();
        		nums.push(b+a);
        	}
        	else if(s.equals("-")) {
        		int a = nums.pop();
        		int b = nums.pop();
        		nums.push(b-a);
        	}
        	else if(s.equals("*")) {
        		int a = nums.pop();
        		int b = nums.pop();
        		nums.push(b*a);
        	}
        	else if(s.equals("/")) {
        		int a = nums.pop();
        		int b = nums.pop();
        		nums.push(b/a);
        	}
        	else {
        		nums.push(Integer.parseInt(s));
        	}
        }
		return nums.pop();
    }

}
