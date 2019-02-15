package org.practice.array;

public class FindLocalMinimum {

	public static void main(String[] args) {
		
		int a[] = {9, 6, 3, 14, 5, 7, 4};
		int start = 0;
		int end = a.length-1;
		
		System.out.println(localMinimum(a, start, end));
	}
	
	public static int localMinimum(int a[], int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			if(a[mid-1] > a[mid] && a[mid+1] > a[mid]) {
				return mid;
			} else if(a[mid-1] < a[mid]) {
				return localMinimum(a, start, mid);
			} else {
				return localMinimum(a, mid, end);
			}
		}
		return -1;
	}
}
