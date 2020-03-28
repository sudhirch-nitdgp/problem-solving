package org.geeks.matrix;

public class SpiralTraversalOfMatrix {

	public static void main(String[] args) {
		
		int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		spiralTraversal(a);

	}
	
	public static void spiralTraversal(int a[][]) {
		int top = 0, left = 0, right = 3, bottom = 3;
		
		while(left < right && top < bottom) {
			for(int i=left; i<=right; i++) {
				System.out.println(a[top][i]);
			}
			top++;
			for(int i=top; i<=bottom; i++) {
				System.out.println(a[i][right]);
			}
			right--;
			for(int i=right; i>=left; i--) {
				System.out.println(a[bottom][i]);
			}
			bottom--;
			for(int i=bottom; i>=top; i--) {
				System.out.println(a[i][left]);
			}
			left++;
			
		}
	}

}
