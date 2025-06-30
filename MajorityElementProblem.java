//$Id$
package com.leet;

public class MajorityElementProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {2,2,1,1,1,2,2};
		System.out.println( majorityElement(nums) );
	}

	public static int majorityElement(int[] nums) {
        
		int res=0, count=0;
		
		for(int n: nums) {

			if(count==0)
				res = n;
			
			count += (n==res) ? 1 : -1;
			
		}
		return res;
    }
}
