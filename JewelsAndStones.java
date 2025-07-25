//$Id$
package com.leet;
import java.util.*;
import java.util.stream.Collectors;

public class JewelsAndStones {

	public static void main(String[] args) {

		String jewels = "adsf", stones = "asdf";
		numJewelsInStones(jewels, stones);
	}

	public static int numJewelsInStones(String jewels, String stones) {
        int res = 0;
        
        if(stones.length() == 0 || jewels.length() == 0) return res;
        int m = jewels.length(), n = stones.length();
        Set<Character> jewelSet = new HashSet<>();
        for(int i=0;i<m;i++) {jewelSet.add(jewels.charAt(i));}
        
        for(int i=0;i<n;i++) {
        	if(jewelSet.contains(stones.charAt(i))) res++;
        }
        
        return res;
    }
}
