//$Id$
package com.leet;

public class Search2DMatrix {

	public static void main(String[] args) {
		
		int[][] matr = 
				{{1,3}};
		searchMatrix(matr, 3);
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {

		int n = matrix.length;
		int start = 0, end = 0, row = -1;
		for(int i=0; i < n; i++) {
			int iLen = matrix[i].length;
			if(target >= matrix[i][0] && target <= matrix[i][iLen-1]) {
				end = matrix[i].length-1;
				row  = i;
				break;
			}
		}
		if(row == -1)
			return false;
		return binarySearch(matrix[row], target, start, end);
    }

	private static boolean binarySearch(int[] arr, int target, int start, int end) {
		
		int center = (start+end) / 2;

		if(start > end)
			return false;
        if(target == arr[center])
            return true;
        else if(target < arr[center]) {
        	end = center - 1;
            return binarySearch(arr, target, start, end);
        }
        else if(target > arr[center]) {
        	start = center + 1;
            return binarySearch(arr, target, start, end);
        }

        return false;
	}

}
