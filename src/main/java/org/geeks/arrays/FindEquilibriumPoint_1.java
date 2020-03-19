package org.geeks.arrays;

public class FindEquilibriumPoint_1 {

	public static void main(String[] args) {
		
		int arr[] = {3,4,8,-9,20,6};
		equillibriumPoint(arr);
	}
	
	public static void equillibriumPoint(int arr[]) {
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		
		int l_sum = 0;
		int r_sum = 0;
		for(int i=0; i<arr.length; i++) {
			r_sum = sum - arr[i];
			if(l_sum == r_sum) {
				System.out.println("Equiibrium point " + i);
			}
			l_sum = l_sum + arr[i];
			sum -=arr[i];
		}
	}

}
