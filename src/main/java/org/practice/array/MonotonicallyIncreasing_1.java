package org.practice.array;

public class MonotonicallyIncreasing_1 {

	public static void main(String[] args) {
		
		int a[] = {4,5,7,9,13,17,20,19,16,14,10,8};
		
		System.out.println(increasingSeqIndex(a));

	}
	
	public static int increasingSeqIndex(int a[]) {
		int low = 0;
		int high = a.length-1;
		while(low < high) {
			int mid = (low+high)/2;
			if(a[mid-1] < a[mid] && a[mid+1] < a[mid]) {
				return mid;
			} else if(a[mid-1] < a[mid] && a[mid] < a[mid+1]) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
	}

}
