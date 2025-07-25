//$Id$
package com.leet;
import java.util.*;

public class RansomeNote {

	public static void main(String[] args) {

		String ransomNote = "a", magazine = "a";
		canConstruct(ransomNote, magazine);
	}

	public static boolean canConstruct(String ransomNote, String magazine) {
        
		if(ransomNote.isEmpty()) return true;
		if(magazine.isEmpty()) return false;
		if(magazine.length() < ransomNote.length()) return false;

		int[] freq = new int[26];
		for(char c : magazine.toCharArray()) freq[c - 'a']++;
		
		for(char c : ransomNote.toCharArray()) {

			if(freq[c-'a'] <= 0) return false;
			freq[c-'a']--;
		}
		
		
		return true;
    }
	
}
