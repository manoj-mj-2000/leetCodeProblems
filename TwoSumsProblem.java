//$Id$
package com.leet;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSumProblem {

	public static void main(String[] args) {
		
		int nums[] = {1,3,5,6,8};
		int target = 11;
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}

	private static int[] twoSum(int[] nums, int target) {
		int res[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap();
		
		for(int i=0;i<nums.length;i++) {
			int num = nums[i];
			int sub = target - nums[i];
			if(map.containsKey(sub)) {
				return new int[] {map.get(sub), i};
			}
			else {
				map.put(nums[i], i);
			}
		}
		
		return res;
	}

}
