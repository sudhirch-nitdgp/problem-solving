package org.geeks.search;

public class FindPeakEle {

	public static void main(String[] args) {
		
		int a[] = {25,30,15,18,22,8,5};
		System.out.println(findPeak(a));
	}
	
	public static int findPeak(int a[]) {
		
		int low = 0;
		int high = a.length-1;
		int mid = 0;
		
		while(low <= high) {
			mid = (low+high)/2;
			
			if((mid == 0 || a[mid-1] < a[mid]) && 
					(mid == a.length-1 || a[mid+1] < a[mid])) {
				return a[mid];
			} else if(a[mid+1] > a[mid]) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
	}

}
