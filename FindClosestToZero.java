//$Id$
package com.leet;

public class FindClosestToZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,-1,1};
		findClosestNumber(nums);
		
	}

	public static int findClosestNumber(int[] nums) {
        int n = nums.length, min = Integer.MAX_VALUE, res =0;
        for(int i=0;i<n;i++){
            int diff;
            if(nums[i] < 0)
                diff = 0 - nums[i];
            else
                diff = nums[i] - 0;
            
            if(diff<min) {
            	min = diff;
            	res = nums[i];
            }
            if(diff == min && nums[i] > res)
            	res = nums[i];
//            System.out.println(min+" "+res);
        }

        return res;
    }
}
