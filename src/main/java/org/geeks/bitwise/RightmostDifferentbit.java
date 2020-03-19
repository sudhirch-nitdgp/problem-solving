package org.geeks.bitwise;

public class RightmostDifferentbit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findRightmostDiffBit(52, 8);
	}
	
	public static void findRightmostDiffBit(int m, int n) {
		int res = m ^ n;
		int k = 1;
		while(true) {
			if((res & (1<<k-1)) == 0) {
				k++;
			} else {
				System.out.println(k);
				return;
			}
		}
	}

}
