//$Id$
package com.leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MatrixContainsAllNumbers {

	public static void main(String[] args) {
		
		int[][] matrix = {
				{1,2,3},
				{3,1,2},
				{2,3,1}
		};
		
		boolean res = checkValid(matrix);
		System.out.println(res);
	}
	
	public static boolean checkValid(int[][] matrix) {
		int len = matrix.length;
//		Map<Integer, Set<Integer>> rows = new HashMap();
//		Map<Integer, Set<Integer>> cols = new HashMap();
		
		for(int i=0;i<len;i++) {
			
			boolean rows[] = new boolean[len+1];
			boolean cols[] = new boolean[len+1];
			for(int j=0;j<len;j++) {
				int row = matrix[i][j];
				int col = matrix[j][i];
				
				if(rows[row] || cols[col])
					return false;
				
				rows[row] = true;
				cols[col] = true;
				
			}
		}
		return true;
	}
	
	

}
