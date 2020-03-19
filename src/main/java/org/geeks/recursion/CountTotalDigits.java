package org.geeks.recursion;

public class CountTotalDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalDigits(123));
	}
	
	public static int totalDigits(int n) {
		if(n == 0) return 0;
		return 1 + totalDigits(n/10);
	}

}
