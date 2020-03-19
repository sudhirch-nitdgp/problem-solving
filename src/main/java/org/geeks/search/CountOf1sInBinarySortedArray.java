package org.geeks.search;

public class CountOf1sInBinarySortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {0,0,1,1,1,1,1,1};
		int left_most = count1s(a, 1);
		System.out.println(a.length - left_most);
	}
	
	public static int count1s(int a[], int ele) {
		int low = 0;
		int high = a.length-1;
		int mid;
		while(low <= high) {
			mid = (low+high)/2;
			if(a[mid] == ele && a[mid-1] != ele) {
				return mid;
			} else if(ele <= a[mid]){
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		return -1;
	}

}
