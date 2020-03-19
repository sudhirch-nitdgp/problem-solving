package org.geeks.arrays;

import java.util.Arrays;

public class MeanAndMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,8,3,4};
		
		System.out.println(mean(a)); 
		
		System.out.println(median(a));
	}
	
	public static int mean(int a[]) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum/a.length; 
	}
	
	public static int median(int a[]) {
		Arrays.sort(a);
		int n = a.length;
		if(n % 2 != 0) {
			return a[n/2];
		} else {
			return (a[n/2] + a[(n/2)-1])/2;
		}
	}

}
