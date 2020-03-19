package org.geeks.bitwise;

public class BitDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findNoofFlips(25, 20);
	}
	
	public static void findNoofFlips(int m, int n) {
		int res = m ^ n;
		int count = 0;
		while(res != 0) {
			res = res & (res-1);
			count++;
		}
		System.out.println(count);
	}

}
