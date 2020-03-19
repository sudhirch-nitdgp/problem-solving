package org.geeks.arrays;

/**
 * 
 * @author sudhirc
 * 
 * Given an array arr[] of size N where every element is in range from 0 to n-1. 
 * Rearrange the given array so that arr[i] becomes arr[arr[i]]. 
 * This should be done with O(1) extra space.
 * 
 */
public class ReArrangeAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,0,2,1,3};
		reArrange(a);
	}
	
	public static void reArrange(int a[]) {
		int n = a.length;
		for(int i=0; i<a.length; i++) {
			a[i] += (a[a[i]]%n) * n;
		}
		
		for(int i=0; i<n; i++) {
			a[i] = a[i]/n;
			System.out.println(a[i]);
		}
	}

}
