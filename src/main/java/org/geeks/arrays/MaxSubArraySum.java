package org.geeks.arrays;

public class MaxSubArraySum {

	public static void main(String[] args) {
		
		int a[] = {2,3,-8,7,-1,2,3};
		
		maxSubArraySum(a);

	}
	
	public static void maxSubArraySum(int a[]) {
		int res = a[0];
		int maxEnding = a[0];
		
		for(int i=1; i<a.length; i++) {
			maxEnding = Math.max(maxEnding+a[i], a[i]);
			res = Math.max(maxEnding, res);
		}
		System.out.println(res);
	}

}
