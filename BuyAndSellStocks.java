//$Id$
package com.leet;

public class BuyAndSellStocks {

	public static void main(String[] args) {
		int[] prices = {2,1,2,1,0,1,2};
		maxProfit(prices);
	}
	
	public static int maxProfit(int[] prices) {
     	
		/*
		 * left = buy
		 * right = sell
		 * if(sell < buy)
		 * 	move left & right
		 * else
		 * 	move right only
		 * 
		 * l =10, r=1 => (1< 10) => l++ = 1, r++ = 5
		 * l=1, r=5 => (5<1) =? profit = (5-1) => move right only r++ = 6
		 * */
		int n=prices.length, profit = 0;
		int l=0, r=1;
		while(r < n) {
			
			if(prices[r] < prices[l]) {
				l=r;
			}
			else {
				profit = Math.max(prices[r]-prices[l], profit);
			}
			r++;
		}
		
		
		return profit;
    }
}
