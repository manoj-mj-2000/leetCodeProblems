//$Id$
package com.leet;

import java.util.Arrays;

public class TwoSumIntII {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4};
		int target = 3;
		
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		
		int l = 0, r=numbers.length-1;
		
		while(l < r) {
			if((numbers[l]+numbers[r]) > target)
				r--;
			else if((numbers[l]+numbers[r]) < target)
				l++;
			else
				return new int[] {l+1,r+1};
		}
		
		
		return new int[] {-1,-1};
	}

}
