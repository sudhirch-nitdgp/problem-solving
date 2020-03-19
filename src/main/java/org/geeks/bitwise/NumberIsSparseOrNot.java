package org.geeks.bitwise;

public class NumberIsSparseOrNot {

	public static void main(String[] args) {
		
		isSparse(2);

	}
	
	public static void isSparse(int n) {
		int res = n & (n>>1);
		if(res == 0) {
			System.out.println("It's a Sparse");
		} else {
			System.out.println("It's not a Sparse");
		}
	}

}
