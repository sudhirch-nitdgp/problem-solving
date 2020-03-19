package org.geeks.bitwise;

public class LongestConsecutive1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestConsecutive1s(222);
	}
	
	public static void longestConsecutive1s(int n) {
		int count = 0;
		while(n != 0) {
			n = n & (n<<1);
			count++;
		}
		System.out.println(count);
	}

}
