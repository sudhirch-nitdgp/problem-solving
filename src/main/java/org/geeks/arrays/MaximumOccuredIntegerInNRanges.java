package org.geeks.arrays;

public class MaximumOccuredIntegerInNRanges {

	public static void main(String[] args) {
		
		int l_range[] = {1,3,5,15};
		int r_range[] = {5,7,9,18};
		findInteger(l_range, r_range, 4);
	}
	
	public static void findInteger(int l_range[], int r_range[], int n) {
		int arr[] = new int[1000];
		
		for(int i=0; i<n; i++) {
			arr[l_range[i]]++;
			arr[r_range[i]+1]--;
		}
		int max_occur = 0;
		int max = 0;
		for(int i=1; i<1000; i++) {
			arr[i] = arr[i-1] + arr[i];
			if(arr[i] > max) {
				max = arr[i];
				max_occur = i;
			}
		}
		System.out.println(max_occur);
		
	}

}
