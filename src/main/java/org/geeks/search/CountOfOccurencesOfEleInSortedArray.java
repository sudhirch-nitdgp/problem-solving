package org.geeks.search;

public class CountOfOccurencesOfEleInSortedArray {

	public static void main(String[] args) {
		
		int a[] = {2,3,3,3,3,3};
		
		int left_most = leftMostIndex(a, 3);
		int right_most = rightMostIndex(a, 3);
		
		System.out.println(right_most - left_most + 1);

	}
	
	public static int leftMostIndex(int a[], int ele) {
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		while(low <= high) {
			mid = (low + high)/2;
			if(a[mid] == ele && (mid == 0 || a[mid-1] != ele)) {
				return mid;
			} else if(ele <= a[mid]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}
	
	public static int rightMostIndex(int a[], int ele) {
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		while(low <= high) {
			mid = (low + high)/2;
			if(a[mid] == ele && (mid == a.length-1 || a[mid+1] != ele)) {
				return mid;
			} else if(ele < a[mid]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}

}
