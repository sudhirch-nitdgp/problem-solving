package org.geeks.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3,6,8,11,15,20,22};
		System.out.println(findEle(a, 6));
	}
	
	public static int findEle(int a[], int ele) {
		int l = 0;
		int h = a.length-1;
		int mid = 0;
		while(l <= h) {
			mid = (l+h)/2;
			if(a[mid] == ele) {
				return mid;
			} else if(ele < a[mid]) {
				h = mid-1;
			} else {
				l = mid+1;
			}
		}
		return -1;
	}

}
