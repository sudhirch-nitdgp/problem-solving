package org.practice.array;

public class MonotonicallyIncreasing {

	public static void main(String[] args) {
		int a[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,};
		System.out.println(monotonicallyIncreasingIndex(a));
	}
	
	public static int monotonicallyIncreasingIndex(int a[]) {
		
		int low = 0;
		int high = a.length - 1;
		
		while(low < high) {
			int mid = (low + high) / 2;
			if(a[mid] == 1 && a[mid+1] == 0) {
				return mid;
			} else if(a[mid+1] == 1) {
				low = mid+1;
			} else {
				high = mid-1;
			}
		}
		return -1;
	}

}
