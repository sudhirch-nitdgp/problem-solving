package org.geeks.matrix;

public class SumOfLowerAndUpperTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {
				{6,5,4},
				{1,2,5},
				{7,9,7}
		};
		
		SumOfLowerAndUpper(a, 3, 3);
	}
	
	public static void SumOfLowerAndUpper(int a[][], int r, int c) {
		int upperSum = upperTriangleSum(a, r, c);
		System.out.println("Upper Triangle Sum " + upperSum);
		int lowersum = lowerTriangleSum(a, r, c);
		System.out.println("Lower Triangle Sum " + lowersum);
	}
	
	public static int upperTriangleSum(int a[][], int r, int c) {
		int sum = 0;
		for(int i=0; i<r; i++) {
			for(int j=i; j<c; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}
	
	public static int lowerTriangleSum(int a[][], int r, int c) {
		int sum = 0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<=i; j++) {
				sum += a[i][j];
			}
		}
		return sum;
	}

}
