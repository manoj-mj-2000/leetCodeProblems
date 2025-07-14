//$Id$
package com.leet;

import java.util.Arrays;
import java.util.Stack;

public class CarFleet {

	public static void main(String[] args) {
		
		int[] position = {6,8};
		int[] speed = {3,2};
		int target = 10;
		
		
		System.out.println(carFleet(target,position, speed));
	}
	
	public static int carFleet(int target, int[] position, int[] speed) {
		
		double[] time = new double[target];
		for(int i=0; i< position.length; i++) {
			time[position[i]] = (double) (target - position[i]) / speed[i]; 
		}
		
		int fleet=0;double prevTime=0;
		
		for(int i=target-1;i>=0;i--) {
			if(time[i] > prevTime) {
				fleet++;
				prevTime = time[i];
			}
		}
		
		return fleet;
    }

}
