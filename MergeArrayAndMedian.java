//$Id$
package com.leet;

import java.util.Arrays;

public class MergeArrayAndMedian {

	public static void main(String[] args) {
		
		int[] nums1 = new int[]{1,2};
		int[] nums2 = new int[] {3,4};
		System.out.print(findMedianSortedArrays(nums1, nums2));
	}

	private static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int maxLen = nums1.length + nums2.length;
        int[] c = new int[maxLen];
        int a1 = nums1.length;
        int b1 = nums2.length;
        for (int i = 0; i < a1; i = i + 1) {
            c[i] = nums1[i];
        }

        for (int i = 0; i < b1; i = i + 1) {
            c[a1 + i] = nums2[i];
        }
        Arrays.sort(c);
        if (maxLen % 2 != 0)
            return (double)c[maxLen / 2];
        return (double)(c[(maxLen - 1) / 2] + c[maxLen / 2]) / 2.0;
    }

}
