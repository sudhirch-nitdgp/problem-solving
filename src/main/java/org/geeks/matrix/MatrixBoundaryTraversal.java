package org.geeks.matrix;

public class MatrixBoundaryTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		boundaryTraversal(a);
	}
	
	public static void boundaryTraversal(int a[][]) {
		int r = a.length;
		int c = a[0].length;
		if(r == 1) {
			for(int i=0; i < c; i++) {
				System.out.println(a[0][i]);
			}
		} else if(c == 1) {
			for(int i=0; i < r; i++) {
				System.out.println(a[i][0]);
			}
		} else {
			for(int i=0; i < c; i++) {
				System.out.println(a[0][i]);
			}
			for(int i=1; i < r; i++) {
				System.out.println(a[i][c-1]);
			}
			for(int i=c-2; i>=0; i--) {
				System.out.println(a[r-1][i]);
			}
			for(int i=r-2; i>=1; i--) {
				System.out.println(a[i][0]);
			}
		}
		
		
	}

}
