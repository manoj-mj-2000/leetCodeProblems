//$Id$
package com.leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TimeBasedKeyStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimeMap timeMap = new TimeMap();
		timeMap.set("test", "one", 10);
		timeMap.set("test", "two", 20);
		timeMap.set("test", "three", 30);// store the key "alice" and value "happy" along with timestamp = 1.
		timeMap.get("test", 15);           // return "happy"
		timeMap.get("test", 25);           // store the key "alice" and value "sad" along with timestamp = 3.
		timeMap.get("test", 35);           // return "sad"
	}

	
}

class TimeMap{
	HashMap<String, List<Pair>> store;
	public TimeMap() {
        store = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
    	store.computeIfAbsent(key, k-> new ArrayList()).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
    	
    	List<Pair> pairs = store.getOrDefault(key, new ArrayList());
    	int l = 0, r = pairs.size()-1;
    	String res="";
    	
    	while( l <= r ) {
    		
    		int mid = l + (r-l) /2;
    		
    		if(pairs.get(mid).getTime() <= timestamp) {
    			res = pairs.get(mid).getValue();
    			l = mid + 1;
    		}else {
    			r = mid - 1;
    		}
    	}
        return res;
    }
    
    public class Pair{
    	
    	private int time;
    	private String value;
    	
    	public Pair(int time, String value) {
    		this.time = time;
    		this.value = value;
    	}
    	
    	public int getTime() {
    		return time;
    	}
    	public String getValue() {
    		return value;
    	}
    	
    }
    
}
