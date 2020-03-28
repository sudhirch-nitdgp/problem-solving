package org.geeks.sorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {18,15,30,25,12,10};
		insertionSort(a);

	}
	
	public static void insertionSort(int a[]) {
		
		for(int i=1; i<a.length; i++) {
			int key = a[i];
			int j = i-1;
			while(j>=0 && a[j] > key) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = key;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
