//$Id$
package com.leet;

public class SearchRotatedArray {

	public static void main(String[] args) {
		
		int nums[] = {5,1,3};
		System.out.println(search(nums, 3));
	}
	
	public static int search(int[] nums, int target) {
        
		int l = 0, r = nums.length - 1;
		
		while(l <= r) {
			
			int m = (l+r) / 2;
			
			if(nums[m] == target)
				return m;
			
			if(nums[l] <= nums[m]) {
				if(target > nums[m] || target < nums[l])
					l = m + 1;
				else 
					r = m - 1;
			}
			else {
				if(target < nums[m] || target > nums[r])
					r = m - 1;
				else
					l = m + 1;
			}
		}
		return -1;
		
    }

}
