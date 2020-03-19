package org.geeks.arrays;

public class LongestEvenOddSubArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {4,5,10,12,14,15,6,1};
		evenOddSubArray(a);
	}
	
	public static void evenOddSubArray(int a[]) {
		int count = 1;
		int res = 1;
		for(int i=0; i<a.length-1; i++) {
			if(a[i] % 2 == 0 && a[i+1] %2 != 0 ||
				a[i] % 2 != 0 && a[i+1] %2 == 0) {
				count++;
			} else {
				count = 1;
			}
			res = Math.max(res, count);
		}
		System.out.println(res);
	}

}
