package org.geeks.bitwise;

public class CheckNumIsPowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPowerOf2(8);
	}
	
	public static void checkPowerOf2(int n) {
		if((n & (n-1)) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
