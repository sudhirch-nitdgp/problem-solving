package org.geeks.arrays;

/**
 * 
 * @author sudhirc
 * You are given an array arr[] of N integers including 0. 
 * The task is to find the smallest positive number missing from the array.
 */
public class SmallestPossitiveMissingNumber {

	public static void main(String[] args) {
		
		int a[] = {0, -10, 1, 3, -20, 2, 5};
		//int a[] = {1,2,3,4,5};
		findSmallestMissingNumber(a);

	}
	
	public static void findSmallestMissingNumber(int a[]) {
		int size = a.length;
		int pos_start = segregate(a);
		System.out.println("Possitive Start " + pos_start);
		int arr[] = new int[size-pos_start];
		int j = 0;
		for(int i=pos_start; i<size; i++) {
			arr[j] = a[i];
			j++;
		}
		System.out.println(missingNumber(arr));
	}
	
	public static int segregate(int a[]) {
		int tmp;
		int j=0;
		for(int i=0; i<a.length; i++) {
			if(a[i] <= 0) {
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				j++;
			}
		}
		return j;
	}
	
	public static int missingNumber(int arr[]) {
		int size = arr.length;
		for(int i=0; i<size; i++) {
			if(Math.abs(arr[i])-1 < size) {
				arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
			}
		}
		
		for(int i=0; i<size; i++) {
			if(arr[i] > 0) {
				return i+1;
			}
		}
		return size+1;
	}

}
