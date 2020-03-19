package org.geeks.arrays;

/**
 * 
 * @author sudhirc
 * 
 * Given an array A[] of N positive integers. 
 * The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].
 * 
 */
public class MaximumIndex {

	public static void main(String[] args) {
		
		int a[] = {34,8,10,3,2,80,30,33,1};
		findMaxIndex(a);

	}
	
	public static void findMaxIndex(int a[]) {
		int n = a.length;
		int lmin[] = new int[n];
		int rmax[] = new int[n];
		
		lmin[0] = a[0];
		for(int i=1; i<n; i++) {
			lmin[i] = Math.min(lmin[i-1], a[i]);
		}
		
		rmax[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--) {
			rmax[i] = Math.max(a[i], rmax[i+1]);
		}
		
		int i=0; 
		int j=0;
		int maxDiff = -1;
		
		while(i<n && j<n) {
			if(lmin[i] < rmax[j]) {
				maxDiff = Math.max(maxDiff, j-i);
				j++;
			} else {
				i++;
			}
		}
		
		System.out.println(maxDiff);
	}
	
	

}
