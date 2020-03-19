package org.geeks.recursion;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(125));
	}
	
	public static int sumOfDigits(int n) {
		if(n == 0) return 0;
		return n%10 + sumOfDigits(n/10);
	}

}
