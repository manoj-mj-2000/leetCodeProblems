//$Id$
package com.leet;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numb[] = {1,2,4};
		boolean res = hasDuplicate(numb);
		System.out.println(res);
	}

	public static boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
