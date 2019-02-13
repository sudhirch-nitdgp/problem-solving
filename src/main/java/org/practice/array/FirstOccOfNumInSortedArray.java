package org.practice.array;

public class FirstOccOfNumInSortedArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,4,4,5,5,6};
		System.out.println(findFirstOccurance(a, 2));
	}
	
	public static int findFirstOccurance(int a[], int num) {
		int start = 0;
		int end = a.length - 1;
		while(start <= end) {
			int mid = (start+end)/2;
			if((mid == start && a[mid] == num) || 
					(a[mid] == num && a[mid-1] < a[mid])) {
				return mid;
			} else if(num < mid) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}

}
