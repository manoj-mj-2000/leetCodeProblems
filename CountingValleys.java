//$Id$
package com.hackerrank;

public class CountingValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int steps = 8;
		String path = "UDDDUDUUDDUUDU";
		
		int res = countingValleys(steps, path);
		System.out.println(res);
	}
	
	public static int countingValleys(int steps, String path) {
	    // Write your code here
		int valleys = 0, count = 0; //start at sea level
		boolean valley_start = false;
		for(char c : path.toCharArray()) {
			if(c=='U') {
				count++;
				if(count == 0)
					valleys++;
			}
			else {
				count--;
			}
		}

		return valleys;
    }

}
