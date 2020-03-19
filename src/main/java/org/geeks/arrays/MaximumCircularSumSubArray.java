package org.geeks.arrays;

public class MaximumCircularSumSubArray {
	
	public static void main(String args[]) {
		int a[] = {8,-4,3,-5,4};
		
		System.out.println(overalMaxSum(a));
	}

	public static int overalMaxSum(int a[]) {
		
		int normalMaxSum = maxSubArraySum(a);
		
		if(normalMaxSum < 0) {
			return normalMaxSum;
		}
		
		int totalSum = 0;
		for(int i=0; i<a.length; i++) {
			totalSum += a[i];
			a[i] = -a[i];
		}
		
		int circularSum = maxSubArraySum(a);
		circularSum += totalSum;
		
		return Math.max(normalMaxSum, circularSum);

	}
	
	public static int maxSubArraySum(int a[]) {
		int maxSoFar = a[0];
		int maxSum = a[0];
		
		for(int i=1; i<a.length; i++) {
			maxSum = Math.max(maxSum + a[i], a[i]);
			maxSoFar = Math.max(maxSum, maxSoFar);
		}
		return maxSoFar;
	}

}
