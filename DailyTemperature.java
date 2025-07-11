//$Id$
package com.leet;

import java.util.Stack;

public class DailyTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {73,74,75,71,69,72,76,73};
		System.out.println(dailyTemperatures(arr));
	}
	
	public static int[] dailyTemperatures(int[] temperatures) {
        
		int[] res = new int[ temperatures.length ];
		int n = temperatures.length;
		
		Stack<int[]> temp = new Stack(); 
		
		for(int i=0;i<n;i++) {
			int t = temperatures[i];
			
			while(!temp.isEmpty() && t > temp.peek()[0]) {
				
				int[] pair = temp.pop();
				res[pair[1]] = i - pair[1];
			}
			temp.push(new int[] {t, i});
		}
		
		return res;
    }

}
