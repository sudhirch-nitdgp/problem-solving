package org.geeks.search;

public class FindAnEleInInfiniteSizedSortedArray {

	public static void main(String[] args) {
		
		int a[] = new int[10000];
		
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
		}
		System.out.println(findEle(a, 10000));
	}
	
	public static int findEle(int a[], int ele) {
		if(a[0] == ele) return 0;
		int i=1;
		while(a[i] < ele) {
			if(i*2 < a.length-1) {
				i = i*2;
			} else {
				i = a.length-1;
				break;
			}
		}
		int low = i/2;
		int high = i;
		int mid = 0;
		while(low <= high) {
			mid = (low+high)/2;
			if(a[mid] == ele) {
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
