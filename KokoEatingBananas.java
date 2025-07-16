//$Id$
package com.leet;

import java.util.Arrays;

public class KokoEatingBananas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int piles[] = {1,4,3,2};
		minEatingSpeed(piles, 9);
	}
	
	public static int minEatingSpeed(int[] piles, int h) {int l = 1;
    int r = Arrays.stream(piles).max().getAsInt();
    int res = r;

    while (l <= r) {
        int k = (l + r) / 2;

        long totalTime = 0;
        for (int p : piles) {
            totalTime += Math.ceil((double) p / k);
        }
        if (totalTime <= h) {
            res = k;
            r = k - 1;
        } else {
            l = k + 1;
        }
    }
    return res;}

}
