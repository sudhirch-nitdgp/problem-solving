package org.practice.array;

public class LargestSumContiguosSubArray {

	public static void main(String[] args) {
		
		int a[] = {-2,-3,4,-1,-2,1,5,-3};
		
		System.out.println(findMaxSum(a));

	}
	
	public static int findMaxSum(int a[]) {
		int sum = 0;
		int maxSum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			if(sum < 0) {
				sum = 0;
			} 
			if(sum > maxSum) {
				maxSum = sum;
			}
		}
		return maxSum;
	}

}
