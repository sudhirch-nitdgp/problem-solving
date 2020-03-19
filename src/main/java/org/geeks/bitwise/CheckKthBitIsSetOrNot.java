package org.geeks.bitwise;

public class CheckKthBitIsSetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkKthBit(5, 3);
	}
	
	public static void checkKthBit(int n, int k) {
		if((n & 1<<(k-1)) != 0) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

}
