//$Id$
package com.hackerrank;
import java.util.*;

public class JumpingOnClouds {

	public static void main(String[] args) {
		List<Integer> c = Arrays.asList(0, 0, 0, 1, 0, 0);
		
		int res = jumpingOnClouds(c);
		System.out.println(res);
	}

	public static int jumpingOnClouds(List<Integer> c) {
	    // Write your code here
		int n = c.size(), jumps=0, i=0;
		while(i<n) {
			
			if(i+2 < n && c.get(i+2) == 1)
				i+=1;
			else if(i+1 < n)
				i+=2;
			else
				break;
			jumps++;
			
		}
		
		return jumps;
    }
}
