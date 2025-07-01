//$Id$
package com.leet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = {{'.','.','.','.','5','.','.','1','.'},
				{'.','4','.','3','.','.','.','.','.'},
				{'.','.','.','.','.','3','.','.','1'},
				{'8','.','.','.','.','.','.','2','.'},
				{'.','.','2','.','7','.','.','.','.'},
				{'.','1','5','.','.','.','.','.','.'},
				{'.','.','.','.','.','2','.','.','.'},
				{'.','2','.','9','.','.','.','.','.'},
				{'.','.','4','.','.','.','.','.','.'}};
		System.out.println(validSudoku(board));
	}
	
	public static boolean validSudoku(char[][] board) {
		
		Map<String, Set<Character>> squares = new HashMap();
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				
				
				if(board[i][j] == '.') continue;
				
				String sqKey = i/3+","+j/3;
				if(!isSafe(board,i,j,board[i][j]) ||
						squares.computeIfAbsent(sqKey, k -> new HashSet()).contains(board[i][j])) {
					return false;
				}

				squares.get(sqKey).add(board[i][j]);
				
			}
		}
		
		return true;
	}

	public static boolean isSafe(char[][] board, int row, int col, char val) {
		
		for(int i=0;i<9;i++) {
			if(board[i][col] == val && row != i)
				return false;
		}
		
		for(int j=0;j<9;j++) {
			if(board[row][j] == val && col != j)
				return false;
		}
		
		return true;
	}
}
