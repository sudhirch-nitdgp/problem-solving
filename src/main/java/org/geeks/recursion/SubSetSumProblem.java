package org.geeks.recursion;

public class SubSetSumProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 5, 2, 3, 6};
		
		System.out.println(subSetSum(arr, arr.length, 8));

	}
	
	public static int subSetSum(int a[], int n, int sum) {
		if(n == 0) {
			return sum == 0 ? 1 : 0;
		}
		return subSetSum(a, n-1, sum) +
		subSetSum(a, n-1, sum-a[n-1]);
	}

}
