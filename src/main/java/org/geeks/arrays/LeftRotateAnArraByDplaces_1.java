package org.geeks.arrays;

public class LeftRotateAnArraByDplaces_1 {

	public static void main(String[] args) {
		
		int a[] = {10, 5, 7, 32, 12, 15, 20, 22};
		
		rotate(a, 3);

	}

	private static void rotate(int[] a, int d) {
		reverse(a,0,d-1);
		reverse(a, d, a.length-1);
		reverse(a, 0, a.length-1);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static void reverse(int[] a, int i, int d) {
		
		int start = i;
		int end = d;
		
		while(start < end) {
			int tmp = a[start];
			a[start] = a[end];
			a[end] = tmp;
			start++;
			end--;
		}
		
	}

}
