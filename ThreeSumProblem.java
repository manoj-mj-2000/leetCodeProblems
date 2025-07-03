//$Id$
package com.leet;
import java.util.*;

public class ThreeSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {0,0,0};
		
		threeSum(nums);
		
	}
	
	public static List<List<Integer>> threeSum(int[] nums){
		
		List<List<Integer>> res = new ArrayList();
		
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i++) {
			
			if(nums[i] > 0) break; //as we sorted the array, if nums[i] greater than 0, then assume no possibility for 0s.
			
			if(i>0 && nums[i] == nums[i-1]) continue;
			
			int l = i+1, r = nums.length-1;
			
			while(l<r) {
				int sum = nums[i]+nums[l]+nums[r];
				if(sum > 0)
					r--;
				else if(sum < 0)
					l++;
				else {
					res.add(Arrays.asList(nums[i], nums[l], nums[r]));
					
					l++;
					r--;
					while(l<r && nums[l] == nums[l-1]) {
						l++;
					}
				}
			}
			
		}
		
		return res;
	}

}
