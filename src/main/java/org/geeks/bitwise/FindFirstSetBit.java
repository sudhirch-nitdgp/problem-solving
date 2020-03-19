package org.geeks.bitwise;

public class FindFirstSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstSetBit(12));
	}
	
	public static int firstSetBit(int n) {
		if(n == 0) {
			return 0;
		}
		int i=1;
		while(true) {
			if((n & 1<<i-1) == 0) {
				i++;
			} else {
				return i;
			}
		}
	}

}
