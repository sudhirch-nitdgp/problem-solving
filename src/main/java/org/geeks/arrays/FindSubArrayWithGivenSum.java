package org.geeks.arrays;

public class FindSubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int a[] = {1,4,20,3,10,5};
		subArrayWithGivenSum(a, 33);

	}
	
	public static void subArrayWithGivenSum(int a[], int sum) {
		int ele_sum = 0;
		int start = 0;
		for(int i=0; i<a.length; i++) {
			ele_sum += a[i];
			if(ele_sum > sum) {
				while(ele_sum > sum) {
					ele_sum -= a[start];
					start++;
				}
			}
			if(ele_sum == sum) {
				System.out.println("Yes");
				System.out.println("Stat " + start + " end " + i);
				return;
			} 
		}
		System.out.println("No");
	}

}
