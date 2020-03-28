package org.geeks.search;

public class FloorInSortedArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,8,10,11,12,19};
		int index = floorOfAnEle(a, 12);
		System.out.println(a[index-1]);
	}
	
	public static int floorOfAnEle(int a[], int ele) {
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		while(low <= high) {
			mid = (low+high)/2;
			if(a[mid] > ele && a[mid-1] <= ele) {
				return mid;
			} else if(a[mid-1] > ele) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}

}
