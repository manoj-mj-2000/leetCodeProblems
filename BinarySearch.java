//$Id$
package com.dsa;

public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[] = {-1,0,3,5,9,12};
		int res = binarySearch(arr, 2, 0, arr.length-1);
		System.out.println(res);
		
//		int arr2[] = {9,8,7,6,5,4,3,2,1};
//		boolean result = binarySearchOA(arr2, 4, 0, arr2.length-1);
//		System.out.println(result);
	}

	private static int binarySearch(int[] arr, int target, int start, int end) {
		int center = (start+end) / 2;

		if(start > end)
			return -1;
        if(target == arr[center])
            return center;
        else if(target < arr[center]) {
        	end = center - 1;
            return binarySearch(arr, target, start, end);
        }
        else if(target > arr[center]) {
        	start = center + 1;
            return binarySearch(arr, target, start, end);
        }

        return -1;
		
	}

}
