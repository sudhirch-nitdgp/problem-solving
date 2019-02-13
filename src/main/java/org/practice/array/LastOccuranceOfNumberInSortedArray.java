package org.practice.array;

public class LastOccuranceOfNumberInSortedArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,4,4,5,5,6};
		
		System.out.println(findLastOccurance(a, 5));

	}
	
	public static int findLastOccurance(int a[], int num) {
		int start = 0;
		int end = a.length-1;
		while(start <= end) {
			int mid = (start+end)/2;
			if((a[mid] == num && mid == end) || (a[mid] == num && a[mid+1] > a[mid])) {
				return mid;
			} else if(num < a[mid]) {
				end = mid-1;
			} else {
				start = mid+1;
			}
		}
		return -1;
	}

}
