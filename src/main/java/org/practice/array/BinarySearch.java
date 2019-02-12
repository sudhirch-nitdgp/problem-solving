package org.practice.array;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {11,22,33,44,55,66,77,88,99};
		System.out.println("Ele found at the index  " + searchEle(a, 77));
	}
	
	public static int searchEle(int a[], int ele) {
		int low = 0;
		int high = a.length-1;
		while(low < high) {
			int mid = (low + high)/2;
			if(a[mid] == ele) {
				return mid;
			}
			if(ele < a[mid]) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}

}
