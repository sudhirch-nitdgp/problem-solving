package org.geeks.sorting;

public class UnionOf2SortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,5,10,10,15,15,15,20};
		
		int b[] = {5,10,10,15,30};
		
		union(a, b);
	}
	
	public static void union(int a[], int b[]) {
		int i=0; int j=0;
		int m = a.length;
		int n = b.length;
		
		while(i<m && j<n) {
			if(i>0 && a[i-1] == a[i]) {
				i++;
				continue;
			}
			if(j>0 && b[j-1] == b[j]) {
				j++;
				continue;
			}
			
			if(a[i] < b[j]) {
				System.out.println(a[i]);
				i++;
			} else if(a[i] > b[j]) {
				System.out.println(b[j]);
				j++;
			} else {
				System.out.println(a[i]);
				i++;
				j++;
			}
			
		}
		
		while(i<m) {
			if(a[i-1] != a[i]) {
				System.out.println(a[i]);
			}
			i++;
		}
		
		while(j<n) {
			if(b[j-1] != b[j]) {
				System.out.println(b[j]);
			}
			j++;
		}
	}

}
