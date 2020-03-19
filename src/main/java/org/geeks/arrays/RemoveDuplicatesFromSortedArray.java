package org.geeks.arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,5,10,12,12,17}; 
		removeDuplicates(arr);
	}
	
	public static void removeDuplicates(int arr[]) {
		int res = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
		
		for(int i=0; i<res; i++) {
			System.out.println(arr[i]);
		}
	}

}
