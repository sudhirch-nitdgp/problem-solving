package org.geeks.arrays;

public class FindMaxDifference_1 {

	public static void main(String[] args) {
		
		int arr[] = {2,3,10,6,4,8,1};
		findMaxDiff(arr);

	}

	private static void findMaxDiff(int[] arr) {
		
		int min = arr[0];
		int maxDiff = 0;
		
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			
			int diff = arr[i+1] - min;
			
			if(diff > maxDiff) {
				maxDiff = diff;
			}
		}
		
		System.out.println(maxDiff);
		
	}

}
