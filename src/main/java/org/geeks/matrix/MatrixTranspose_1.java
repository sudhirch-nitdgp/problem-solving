package org.geeks.matrix;

public class MatrixTranspose_1 {

	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		transpose(a, 4);

	}
	
	public static void transpose(int a[][], int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				// swap a[i][j] and a[j][i]
				int tmp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = tmp;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
