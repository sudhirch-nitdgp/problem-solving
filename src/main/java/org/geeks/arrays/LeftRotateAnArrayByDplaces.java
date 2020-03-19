package org.geeks.arrays;

public class LeftRotateAnArrayByDplaces {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		
		leftRotate(arr, 3);

	}
	
	public static void leftRotate(int arr[], int d) {
		int n = arr.length;
		int k=0;
		int tmp[] = new int[d];
		
		for(int i=0; i<d; i++) {
			tmp[i] = arr[i];
		}
		
		for(int i=d; i<n; i++) {
			arr[i-d] = arr[i];
		}
		
		for(int i=n-d; i<n; i++) {
			arr[i] = tmp[k];
			k++;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

}
