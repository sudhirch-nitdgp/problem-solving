package org.geeks.search;

public class BinarySearch_Recursion {

	public static void main(String[] args) {
		
		int a[] = {2,3,6,8,11,15,20,22};
		System.out.println(binarySearch(a, 0, a.length-1,6));
	}
	
	public static int binarySearch(int a[], int l, int h, int ele) {
		if(l > h) {
			return -1;
		}
		int mid = (l+h)/2;
		if(a[mid] == ele) {
			return mid;
		} else if(ele < a[mid]) {
			return binarySearch(a, l, mid-1, ele);
		} else {
			return binarySearch(a, mid+1, h, ele);
		}
	}

}
