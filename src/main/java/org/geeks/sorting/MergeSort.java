package org.geeks.sorting;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {18,15,30,25,12,10,5,15};
		mergeSort(a);
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}
	
	public static void mergeSort(int a[]) {
		int n = a.length;
		if(n < 2) {
			return;
		}
		int mid = n/2;
		
		int left[] = new int[mid];
		int right[] = new int[n-mid];
		
		for(int i=0; i < mid; i++) {
			left[i] = a[i];
		}
		
		for(int i=mid; i<n; i++) {
			right[i-mid] = a[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, a);
	}

	private static void merge(int[] left, int[] right, int[] a) {
		
		int i=0;
		int j=0;
		
		int m = left.length;
		int n = right.length;
		
		int k = 0;
		while(i<m && j<n) {
			if(left[i] <= right[j]) {
				a[k] = left[i];
				i++;
			} else {
				a[k] = right[j];
				j++;
			}
			k++;
		}
		
		while(i<m) {
			a[k] = left[i];
			i++;
			k++;
		}
		
		while(j<n) {
			a[k] = right[j];
			j++;
			k++;
		}
		
	}

}
