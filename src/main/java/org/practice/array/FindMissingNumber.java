package org.practice.array;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,4,6,3,7,8};
		
		System.out.println(missingNumber(a, 8));
		
	}
	
	public static int missingNumber(int a[], int n) {
		int totalSum = (n * (n+1))/2;
		for(int i = 0; i<a.length; i++) {
			totalSum -= a[i];
		}
		return totalSum;
	}
	
}
