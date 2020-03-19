package org.geeks.arrays;

public class FindLargestAndSecondLargest {

	public static void main(String[] args) {
		int a[] = {2,1,2};
		largestAndSecondLargest(a);
	}

	private static void largestAndSecondLargest(int[] a) {
		
		int largest = 0;
		int second_largest = -1;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i] > largest) {
				second_largest = largest;
				largest = a[i];
			} else if(a[i] > second_largest && a[i] != largest) {
				second_largest = a[i];
			}
		}
		System.out.println(largest + "   " + second_largest);
	}

}
