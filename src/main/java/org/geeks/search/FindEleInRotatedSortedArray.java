package org.geeks.search;

public class FindEleInRotatedSortedArray {

	public static void main(String[] args) {
		
		int a[] = {20,25,30,35,40,45,5,10,15};
		System.out.println(findEle(a, 55));
	}
	
	public static int findEle(int a[], int ele) {
		int pivot = pivotIndex(a);
		int low = 0;
		int high = 0;
		int mid = 0;
		if(ele == a[pivot]) {
			return pivot;
		}
		if(ele > a[0]) {
			low = 0;
			high = pivot-1;
		} else {
			low = pivot +1;
			high = a.length-1;
		}
		
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
	
	public static int pivotIndex(int a[]) {
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		while(low <= high) {
			mid = (low+high)/2;
			if(a[mid-1] < a[mid] && a[mid+1] < a[mid]) {
				return mid;
			} else if(a[0] < a[mid]) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
	}

}
