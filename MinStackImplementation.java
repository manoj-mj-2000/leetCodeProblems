//$Id$
package com.leet;

import java.util.ArrayList;
import java.util.Stack;

public class MinStackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack minStack = new MinStack();
		minStack.push(20);
		minStack.pop();
		minStack.push(20);
		minStack.top();
		minStack.push(-20);
		minStack.getMin();
		int i=0;
//		minStack.push(-2);
//		minStack.push(0);
//		minStack.push(-3);
//		System.out.println(minStack.getMin() ); // return -3
//		minStack.pop();
//		System.out.println(minStack.top());    // return 0
//		System.out.println(minStack.getMin()); // return -2
//		minStack.push(2);
//		minStack.push(-4);
//		minStack.push(3);
//		System.out.println(minStack.getMin()); //-4
//		minStack.pop();
//		System.out.println(minStack.getMin()); //-4
//		minStack.pop();
//		System.out.println(minStack.top()); // 2
//		System.out.println(minStack.getMin()); //
//		minStack.pop();
//		System.out.println(minStack.top());
//		System.out.println(minStack.getMin());
	}

}

class MinStack {
	Stack<Integer> stack;
	Stack<Integer> minStack;
	int min = Integer.MAX_VALUE;

	public MinStack() {
		stack = new Stack();
		minStack = new Stack();
	}

	public void push(int val) {
		stack.push(val);
		min = minStack.isEmpty() ? val : Math.min(min, val);
		minStack.push(min);
	}

	public void pop() {
		if (!stack.isEmpty()) {
			stack.pop();
			minStack.pop();
			
			if(!minStack.isEmpty()) {
				min = minStack.peek();
			}
		}
	}

	public int top() {
		if (!stack.isEmpty())
			return stack.peek();
		return -1;
	}

	public int getMin() {
		if(!minStack.isEmpty())
			return minStack.peek();
		return -1;
	}
}
