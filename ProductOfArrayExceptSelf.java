//$Id$
package com.leet;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inp = new int[] {1,2,3,4};
		
		System.out.println( Arrays.toString( productExceptSelf(inp) ));
	}
	
	public static int[] productExceptSelf(int[] nums) {

		int[] res;
		int n = nums.length;
		int prod=1, zeros=0;
		for(int i: nums) {
			if(i!=0)
				prod *= i;
			else
				zeros++;
		}
		
		if(zeros > 1)
			return new int[n];
		
		res = new int[n];
		for(int i=0; i<n; i++) {
			if(zeros > 0)
				res[i] = (nums[i] == 0) ? prod : 0;
			else
				res[i] = prod / nums[i];
		}
		return res;
	}

}
