package org.geeks.arrays;

public class ArrayInsertAtIndex {

	public static void main(String[] args) {
		
		int a[] = {10,12,13,14,15,-1};
		insert(a, 3, 20);

	}
	
	public static void insert(int a[], int index, int ele) {
		for(int i=a.length-2; i>=index; i--) {
			a[i+1] = a[i];
		}
		a[index] = ele;
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
