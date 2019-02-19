package org.practice.array;

public class CeillingInSortedArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,8,10,12,19};
		
		System.out.println(findCeilling(a, 0, a.length-1, 5));
	}
	
	public static int findCeilling(int a[], int start, int end, int ele) {
		if(ele < a[start]) {
			return a[start];
		}
		
		if(ele > a[end]) {
			return -1;
		}
		
		int mid = (start+end)/2;
		
		if(a[mid] == ele) {
			return a[mid];
		} else if(ele < a[mid]) {
			if(a[mid-1] < ele) {
				return a[mid];
			} else {
				return findCeilling(a, start, mid-1, ele);
			}
			
		} else {
			if(ele < a[mid+1]) {
				return a[mid+1];
			} else {
				return findCeilling(a, mid+1, end, ele);
			}
		}
	}

}
