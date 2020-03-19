package org.geeks.arrays;

public class PrefixSumTechnique {
	
	static int prefix[];
	public static void main(String[] args) {
		int arr[] = {2,8,3,9,6,5,4};
		prefix = new int[arr.length];
		computePrefixSum(arr);
		System.out.println(findResult(1, 3));
		System.out.println(findResult(0, 4));
	}
	
	public static void computePrefixSum(int arr[]) {
		prefix[0] = arr[0];
		for(int i=1; i<arr.length; i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
	}
	
	public static int findResult(int l, int r) {
		if(l != 0) {
			return prefix[r] - prefix[l-1];
		} else {
			return prefix[r];
		}
	}

}
