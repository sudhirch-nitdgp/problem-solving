package org.geeks.recursion;

public class FindPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(power(5, 3));
	}
	
	public static int power(int m, int n) {
		if(n == 1) return m;
		return m * power(m,n-1);
	}

}
