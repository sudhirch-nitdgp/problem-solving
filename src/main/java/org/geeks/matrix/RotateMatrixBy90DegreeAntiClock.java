package org.geeks.matrix;

public class RotateMatrixBy90DegreeAntiClock {

	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		rotate(a, 4);

	}
	
	public static void rotate(int a[][], int n) {
		transpose(a, n);
		reverse(a, n);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
	}
	
	public static void transpose(int a[][], int n) {
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int tmp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = tmp;
			}
		}
	}
	
	public static void reverse(int a[][], int n) {
		for(int i=0; i<n; i++) {
			int low = 0;
			int high = n-1;
			while(low < high) {
				int tmp = a[low][i];
				a[low][i] = a[high][i];
				a[high][i] = tmp;
				low++;
				high--;
			}
		}
	}

}
