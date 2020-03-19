package org.geeks.recursion;

public class RodCuttingProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(maxCuts(23, 12, 3, 5));
	}
	
	public static int maxCuts(int n, int a, int b, int c) {
		if(n == 0) return 0;
		if(n < 0) return -1;
		int res = findMax(
		maxCuts(n-a, a, b, c),
		maxCuts(n-b, a, b, c),
		maxCuts(n-c, a, b, c));
		
		if(res == -1) return -1;
		
		return res+1;
	}
	
	public static int findMax(int a, int b, int c) {
		if(a>b && a>c) return a;
		if(b>a && b>c) return b;
		return c;
	}

}
