package org.geeks.recursion;

public class DigitalRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(digitalRoot(9999));
	}
	
	public static int digitalRoot(int n) {
		if(n < 10) return n;
		else {
			return digitalRoot(sumOfDigits(n));
		}
		
	}
	
	public static int sumOfDigits(int num) {
		if(num < 10) return num;
		return num%10 + sumOfDigits(num/10);
	}

}
