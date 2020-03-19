package org.geeks.arrays;

public class TrappingRainWaterProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5,0,6,2,3};
		trapWater(arr);

	}
	
	public static void trapWater(int arr[]) {
		int n = arr.length;
		
		int store = 0;
		
		int lmax[] = new int[n];
		int rmax[] = new int[n];
		
		lmax[0] = arr[0];
		
		for(int i=1; i<n; i++) {
			lmax[i] = Math.max(arr[i], lmax[i-1]);
			System.out.println(lmax[i]);
		}
		
		rmax[n-1] = arr[n-1];
		
		for(int i=n-2; i>=0; i--) {
			rmax[i] = Math.max(arr[i], rmax[i+1]);
			System.out.println(rmax[i]);
		}
		
		for(int i=0; i<n; i++) {
			store += (Math.min(lmax[i], rmax[i]) - arr[i]);
		}
		
		System.out.println(store);
	}

}
