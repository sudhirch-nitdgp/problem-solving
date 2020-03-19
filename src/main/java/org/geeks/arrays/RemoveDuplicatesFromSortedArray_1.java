package org.geeks.arrays;

public class RemoveDuplicatesFromSortedArray_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,5,5,10,12,12,17,20,20,20}; 
		removeDuplicates(arr);
	}
	
	public static void removeDuplicates(int arr[]) {
		int tmp[] = new int[arr.length];
		tmp[0] = arr[0];
		int res = 1;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] != arr[i-1]) {
				tmp[res] = arr[i];
				res++;
			}
		}
		
		for(int i=0; i<res; i++) {
			System.out.println(tmp[i]);
		}
	}

}
