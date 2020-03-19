package org.geeks.arrays;

public class ReverseArrayInGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7,8};
		
		reverseInGroups(a, 3);

	}
	
	public static void reverseInGroups(int a[], int k) {
		for(int i=0; i<a.length; i=i+k) {
			int start = i;
			int end = Math.min(i+k-1, a.length-1);
			
			while(start < end) {
				int tmp = a[start];
				a[start] = a[end];
				a[end] = tmp;
				start++;
				end--;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	

}
