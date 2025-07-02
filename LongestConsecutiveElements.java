//$Id$
package com.leet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveElements {

	public static void main(String[] args) {
		
		int[] nums = new int[] {9,1,4,7,3,-1,0,5,8,-1,6};
		
		
		System.out.println(longestConsecutive(nums));
	}
	
	public static int longestConsecutive(int[] nums) {
		Arrays.sort(nums);
		int length=1, longest=1, n = nums.length;
		
		if(n==1 || n==0) return n;
		
		for(int i=0;i<n-1;i++) {
			if(nums[i+1] == (nums[i]+1)){
				length++;
				longest = Math.max(length, longest);
			}
			else if(nums[i] != nums[i+1]) length = 1;
		}
		
		
		return longest;
	}

}
