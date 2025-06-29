//$Id$
package com.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TopKElementsBucketSort {

	public static void main(String[] args) {
		
		int nums[] = new int[] {1,2,3,4,5};
		int k=2;
		
		System.out.println( Arrays.toString( topKFrequent(nums, k) ));
	}

	private static int[] topKFrequent(int[] nums, int k) {
		
		HashMap<Integer, Integer> countMap = new HashMap(); //{num : count}
		
		for(int n: nums) {
			countMap.put(n, countMap.getOrDefault(n, 0)+1);
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
		
		for(Entry en: countMap.entrySet()) {
			heap.offer(en);
			if(heap.size()>k)
				heap.poll();
		}
		
		int[] res = new int[k];
		for(int i=0;i<k;i++) {
			res[i] = heap.poll().getKey();
		}
		
		return res;
	}

}
