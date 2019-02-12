package org.practice.array;

public class BinarySearch_Rec {

	public static void main(String[] args) {
		
		int a[] = {11,22,33,44,55,66,77,88,99};
		
		System.out.println(searchEle(a, 0, a.length-1, 33));
		
		

	}
	
	public static int searchEle(int a[], int low, int high, int ele) {
		if(low < high) {
			int mid = (low + high) / 2;
			if(a[mid] == ele) {
				return mid;
			} else if(ele < a[mid]) {
				return searchEle(a, low, mid-1, ele);
			} else {
				return searchEle(a, mid+1, high, ele);
			}
		}
		return -1;
	}

}
