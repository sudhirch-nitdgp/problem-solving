package org.geeks.bitwise;

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countSetBits(23);
	}
	
	public static void countSetBits(int n) {
		int count = 0;
		while(n != 0) {
			n = (n & (n-1));
			count++;
		}
		System.out.println(count);
	}

}
