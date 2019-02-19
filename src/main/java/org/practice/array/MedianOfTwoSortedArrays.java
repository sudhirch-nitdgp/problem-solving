package org.practice.array;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		
		int a1[] = {1,12,15,26,38,42};
		
		int a2[] = {2,13,17,30,45,48};
		
		System.out.println(getMedian(a1, a2, 6));

	}
	
	public static int getMedian(int a1[],int a2[],int n) {
		if(n == 0) {
			return -1;
		}
		if(n == 1) {
			return (a1[0] + a2[0])/2;
		}
		if(n == 2) {
			return ((Math.max(a1[0], a2[0]) + Math.min(a1[1], a2[1])))/2;
		}
		int m1 = findMedian(a1, n);
		int m2 = findMedian(a2, n);
		if(m1 < m2) {
			if(n%2 == 0) {
				return getMedian(Arrays.copyOfRange(a1, n/2 - 1, n), Arrays.copyOfRange(a2, 0, n/2 + 1), n/2 + 1);
			} else {
				return getMedian(Arrays.copyOfRange(a1, n/2, n), Arrays.copyOfRange(a2, 0, n/2 + 1), n/2 + 1);
			}
		} else {
			if(n%2 == 0) {
				return getMedian(Arrays.copyOfRange(a1, 0, n/2 + 1), Arrays.copyOfRange(a2, n/2 - 1, n), n/2 + 1);
			} else {
				return getMedian(Arrays.copyOfRange(a1, 0, n/2 + 1), Arrays.copyOfRange(a2, n/2, n), n/2 + 1);
			}
		}
	}
	
	public static int findMedian(int a[], int n) {
		if(n%2 == 0) {
			return (a[n/2] + a[(n/2)-1])/2;
		} else {
			return a[n/2];
		}
	}

}
