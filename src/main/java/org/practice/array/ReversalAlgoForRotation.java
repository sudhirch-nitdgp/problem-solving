package org.practice.array;

public class ReversalAlgoForRotation {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7};
		
		rotateArray(a, 3, a.length);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static void rotateArray(int a[], int d, int n) {
		reverseArray(a, 0, d-1);
		reverseArray(a, d, n-1);
		reverseArray(a, 0, n-1);
	}
	
	public static void reverseArray(int a[], int start, int end) {
		while(start < end) {
			int tmp = a[start];
			a[start] = a[end];
			a[end] = tmp;
			start ++;
			end --;
		}
	}
	
}
