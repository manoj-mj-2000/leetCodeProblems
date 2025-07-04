//$Id$
package com.hackerrank;
import java.util.*;

public class SocksMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		int c= sockMerchant(ar.size(), ar);
		System.out.println(c);
	}
	
	public static int sockMerchant(int n, List<Integer> ar) {
	    // Write your code here
		int pairs=0;
		Map<Integer, Integer> map = new HashMap();
		
		for(int num: ar) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(Map.Entry en : map.entrySet()) {
			int count = (int) en.getValue();
			int color = (int) en.getKey();
			
			pairs += count / 2; 
		}
		return pairs;
    }

}
