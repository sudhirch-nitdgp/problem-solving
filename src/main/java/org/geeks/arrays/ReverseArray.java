package org.geeks.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,5,9,10,12,17};
		reverse(arr);

	}
	
	public static void reverse(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start < end) {
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
			start++;
			end--;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
