//$Id$
package com.leet;

public class RomanToInt {

	public static void main(String[] args) {
		
		System.out.println( romanToInt("LVIII") );
	}
	
	private static int romanToInt(String s) {
		int n = s.length();
		int count = 0;
		for(int i=n-1; i>=0; i--) {
//			System.out.println(s.charAt(i));
			switch(s.charAt(i)) {
			case 'I':
				count++;
				break;
			case 'V':
				count+=5;
				if((i-1)!=-1 && s.charAt(i-1) == 'I') {
					count-=1;
					i--;
				}
				break;
			case 'X':
				count+=10;
				if((i-1)!=-1 && s.charAt(i-1) == 'I') {
					count-=1;
					i--;
				}
				break;
			case 'L':
				count+=50;
				if((i-1)!=-1 && s.charAt(i-1) == 'X') {
					count-=10;
					i--;
				}
				break;
			case 'C':
				count+=100;
				if((i-1)!=-1 && s.charAt(i-1) == 'X') {
					count-=10;
					i--;
				}
				break;
			case 'D':
				count+=500;
				if((i-1)!=-1 && s.charAt(i-1) == 'C') {
					count-=100;
					i--;
				}
				break;
			case 'M':
				count+=1000;
				if((i-1)!=-1 && s.charAt(i-1) == 'C') {
					count-=100;
					i--;
				}
				break;
			}
			
		}
		return count;
	}

}
