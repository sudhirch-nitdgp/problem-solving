package org.geeks.search;

public class LeftMostIndexOfEleInSortedArray {

	public static void main(String[] args) {
		
		int a[] = {2,3,3,3,3,3};
		System.out.println(leftmostIndex(a, 2));

	}
	
	public static int leftmostIndex(int a[], int ele) {
		
		int l = 0;
		int h = a.length-1;
		int mid = 0;
		while(l <= h) {
			mid = (l+h)/2;
			if(a[mid] == ele && (mid == 0 || a[mid-1] != ele)) {
				return mid;
			} else if(ele <= a[mid]) {
				h = mid-1;
			} else {
				l = mid+1;
			}
		}
		return -1;
		
	}

}
