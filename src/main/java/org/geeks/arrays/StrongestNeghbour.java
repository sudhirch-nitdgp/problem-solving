package org.geeks.arrays;

public class StrongestNeghbour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,2,3,4,5};
		strongestNeighbour(a);
	}
	
	public static void strongestNeighbour(int a[]) {
		for(int i=0; i<a.length-1; i++) {
			System.out.println(Math.max(a[i], a[i+1]));
		}
	}

}
