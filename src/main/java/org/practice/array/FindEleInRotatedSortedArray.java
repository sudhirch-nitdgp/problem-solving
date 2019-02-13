package org.practice.array;

public class FindEleInRotatedSortedArray {

	public static void main(String[] args) {
		
		int a[] = {50,60,70,80,90,100,10,20,30,40,42,45,48};
		
		System.out.println(findEle(a, 42));

	}
	
	public static int findPivot(int a[]) {
		int low = 0;
		int high = a.length - 1;
		int mid = 0;
		while(low < high) {
			mid = (low+high)/2;
			if(a[mid-1] > a[mid] && a[mid+1] > a[mid]) {
				return mid;
			} else if(a[low] > a[mid]) {
				high = mid;
			} else {
				low = mid;
			}
		}
		return -1;
	}
		
	public static int findEle(int a[], int ele) {
		int mid = findPivot(a);
		int low = 0;
		int high = 0;
		if(ele >= a[mid] && ele < a[0]) {
			low = mid;
			high = a.length-1;
		} else {
			low = 0;
			high = mid-1;
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
		
		

}
