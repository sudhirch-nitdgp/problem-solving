package org.geeks.arrays;

public class MaximumConsecutive1s {

	public static void main(String[] args) {
		
		int a[] = {1,0,1,1,1,1,0,0,1,1};
		maxConsecutive1s(a);

	}
	
	public static void maxConsecutive1s(int a[]) {
		int max1s = 0;
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == 1) {
				count++;
				max1s = Math.max(max1s, count);
			} else {
				count = 0;
			}
		}
		System.out.println(max1s);
	}

}
