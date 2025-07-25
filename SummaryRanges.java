//$Id$
package com.leet;
import java.util.*;

public class SummaryRanges {

	public static void main(String[] args) {

		int nums[] = {0,2,3,4,6,8,9};
		summaryRanges(nums);
	}

	public static List<String> summaryRanges(int[] nums) {
		int n = nums.length;
        List<String> res = new ArrayList<>();
        if(n==0) return res;
        int i = 0, s = 0;
        
        while(i < n) {
        	if( i+1 < n && nums[i]+1 == nums[i+1]) {
        		i++;
        		continue;
        	}
        	else {
                StringBuilder sb = new StringBuilder();
        		if(nums[s] == nums[i]) {
        			res.add(sb.append(nums[i]).toString());
        		}
        		else {
                    sb.append(nums[s]).append("->").append(nums[i]);
        			res.add(sb.toString());
                }
        		s = i+1;
        		i++;
        	}
        }
        
        return res;
	}
}
