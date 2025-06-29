//$Id$
package com.leet;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String strs[] = {"act","pots","tops","cat","stop","hat"};
		
		groupAnagrams(strs);
	}
	
	public static List<List<String>> groupAnagrams(String[] strs){
		HashMap<String, List<String>> map = new HashMap();
		
		for(String s: strs) {
			char[] sarr = s.toCharArray();
			Arrays.sort(sarr);
			String ns = new String(sarr);
			
			if(!map.containsKey(ns))
				map.put(ns, new ArrayList<String>());
			
			map.get(ns).add(s);
		}
		
		return new ArrayList(map.values());
	}


}
