//$Id$
package com.leet;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {1,2,1,0,4,2,6};
		int k=3;
		System.out.println(maxSlidingWindow(nums, k));
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
		int[] output = new int[n-k +1];
		
		Deque<Integer> q = new LinkedList<Integer>();
		int l=0,r=0;
		
		while(r < n) {
			
			while(!q.isEmpty() && nums[q.getLast()] < nums[r])
				q.removeLast();
			
			q.addLast(r);
			
			if(l > q.getFirst())
				q.removeFirst();
			
			if((r+1) >= k) {
				output[l] = nums[q.getFirst()];
				l++;
			}
			r++;
		}
		
		return output;
    }
}
