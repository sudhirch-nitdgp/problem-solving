package org.geeks.bitwise;

public class FindNumberOccurOddNoofTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,2,3,4,3,4,5,3,5};
		findOddOccuredNumber(a);
	}
	
	public static void findOddOccuredNumber(int a[]) {
		int num = 0;
		for(int i=0; i<a.length; i++) {
			num ^= a[i];
		}
		System.out.println(num);
	}

}
