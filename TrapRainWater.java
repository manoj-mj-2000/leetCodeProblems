//$Id$
package com.leet;

public class TrapRainWater {

	public static void main(String[] args) {
		
		int[] height = {4,2,0,3,2,5};
		trap(height);
	}
	
	public static int trap(int[] height) {
		
		int res =0, n=height.length;
		
		/* 1. need to find max left and max right
		 * 2. then water_trapped = min(max(l), max(r)) - height[i]
		 * */
		
		int[] maxLA = new int[n], maxRA = new int[n];
		
		maxLA[0] = height[0];
		for(int i=1;i<n;i++) {
			maxLA[i] = Math.max(maxLA[i-1], height[i]);
		}
		
		maxRA[n-1] = height[n-1];
		for(int i=n-2;i>=0;i--) {
			maxRA[i] = Math.max(maxRA[i+1], height[i]);
		}
		
		for(int i=0; i<n; i++) {
			res += Math.min(maxLA[i], maxRA[i]) - height[i];
		}
		return res;
	}

}
