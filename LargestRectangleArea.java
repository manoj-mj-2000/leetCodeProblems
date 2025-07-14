//$Id$
package com.leet;

import java.util.Stack;

public class LargestRectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] heights = {2,1,5,6,2,3};
		System.out.println(largestRectangleArea(heights));
	}
	
	public static int largestRectangleArea(int[] heights) {
        int maxArea =0;
        int n = heights.length;
        Stack<Integer> stack = new Stack();
        
        for(int i=0;i<=n;i++) {
        	while(!stack.isEmpty() && (i==n || heights[stack.peek()] >= heights[i])) {
        		int ind = stack.pop();
        		int height = heights[ind];
        		int width = stack.isEmpty() ? i : i - stack.peek() - 1;
        		
        		maxArea = Math.max(maxArea, height * width);
        	}
        	stack.push(i);
        }
		return maxArea;
    }

}
