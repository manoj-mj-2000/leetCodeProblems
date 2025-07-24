//$Id$
package com.leet;

public class MergeTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1 = "abcsfdgfsdg", word2 = "pqre";
		mergeAlternately(word1, word2);
	}

	public static String mergeAlternately(String word1, String word2) {
		StringBuilder s = new StringBuilder();
		
		s = mergeHelper(word1, word2, 0,0,s);
		System.out.println(s);
		return s.toString();
	}

	private static StringBuilder mergeHelper(String word1, String word2, int i, int j, StringBuilder s) {

		if(i >= word1.length() && j >= word2.length()) {
			return s;
		}
		
		if(i < word1.length()) {
			s.append(word1.charAt(i));
		}
		if(j < word2.length()) {
			s.append(word2.charAt(j));
		}
		return mergeHelper(word1, word2, i+1, j+1, s);
	}
}
