package org.geeks.arrays;

public class StockBuyAndSellProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,3,8,12};
		maximizeTheProfit(arr);
	}
	
	public static void maximizeTheProfit(int arr[]) {
		int profit = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i+1] > arr[i]) {
				profit += (arr[i+1]-arr[i]);
			}
		}
		System.out.println(profit);
	}

}
