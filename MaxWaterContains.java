//$Id$
package com.leet;

public class MaxWaterContains {

	public static void main(String[] args) {
		
		int[] heights = {1,7,2,5,4,7,3,6};
		System.out.println(maxArea(heights));
		
	}
	
	public static int maxArea(int[] heights) {
		int max_area=0, l=0, r=heights.length-1;
		
		while(l<r) {
			
			int h = Math.min(heights[l], heights[r]);
			int w = r-l;
			
			int area = h*w;
			max_area = Math.max(area, max_area);
			
			if(heights[l] > heights[r])
				r--;
			else
				l++;
		}
		
		return max_area;
	}

}
