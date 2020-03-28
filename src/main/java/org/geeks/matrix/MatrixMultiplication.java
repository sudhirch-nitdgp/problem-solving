package org.geeks.matrix;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {
				{1,2},
				{3,4},
				{5,6}
		};
		
		int b[][] = {
				{5,6,7},
				{8,9,2}
		};
		
		multiply(a, b, 3, 2, 2, 3);

	}
	
	public static void multiply(int a[][], int b[][], int r1, int c1, int r2, int c2) {
		if(c1 != r2) {
			System.out.println("Not possible");
			return;
		}
		int multiply_matrix[][] = new int[r1][c2];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				int multiply = 0;
				for(int k=0; k<c1; k++) {
					multiply += a[i][k] * b[k][j];
				}
				multiply_matrix[i][j] = multiply;
			}
		}
		
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				System.out.print(multiply_matrix[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
