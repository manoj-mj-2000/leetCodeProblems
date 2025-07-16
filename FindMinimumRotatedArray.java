//$Id$
package com.leet;

public class FindMinimumRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {3,4,5,6,1,2};
		System.out.println(findMin(nums));
	}
	
	public static int findMin(int[] nums) {
        
		int l = 0, r = nums.length -1;
		
		while(l < r) {
			
			int m = (l+r) / 2;
			
			if(nums[m] > nums[r]) {
				l = m + 1;
			}
			else {
				r = m;
			}
		}
		
		return nums[l];
    }

}
