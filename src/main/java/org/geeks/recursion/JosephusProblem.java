package org.geeks.recursion;

public class JosephusProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(jos(5,3));
	}
	
	public static int jos(int n, int k) {
		if(n == 1) return 0;
		else {
			return (jos(n-1, k)+k)%n;
		}
	}

}
