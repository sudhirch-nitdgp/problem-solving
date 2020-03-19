package org.geeks.arrays;

public class FindMaxSumOfSubArrayOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,8,30,-5,20,7};
		findMaxSum(a, 3);
	}
	
	public static void findMaxSum(int a[], int k) {
		int max_sum = 0;
		int sum = 0;
		int n = a.length;
		
		for(int i=0; i<k; i++) {
			sum += a[i];
		}
		max_sum = sum;
		
		for(int i=k; i<n; i++) {
			sum = sum + a[i] - a[i-k];
			max_sum = Math.max(max_sum, sum);
		}
		System.out.println(max_sum);
	}

}
