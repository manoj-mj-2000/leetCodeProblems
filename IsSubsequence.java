//$Id$
package com.leet;

public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "", t = "ahbgdc";
		isSubsequence(s, t);
	}

	public static boolean isSubsequence(String s, String t) {
        
		if(s.isEmpty())
			return true;
        if(t.isEmpty())
            return false;
		
		if(s.length() > t.length())
			return false;
		
        int n = t.length(), sn = s.length();
        int sp =0, tp=0;
        
        while(tp < n) {
        	if(s.charAt(sp) == t.charAt(tp)) {
        		sp++;
        	}
        	if(sp >= sn)
        		return true;
        	tp++;
        }
        
		return false;
    }
}
