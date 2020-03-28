package org.geeks.matrix;

public class TransposeOfMatrix {

	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		transpose(a);

	}
	
	public static void transpose(int a[][]) {
		int r = a.length;
		int c = a[0].length;
		
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				System.out.print(a[j][i] + "  ");
			}
			System.out.println();
		}
	}

}
