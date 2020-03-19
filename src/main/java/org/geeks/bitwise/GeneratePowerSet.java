package org.geeks.bitwise;

public class GeneratePowerSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char chars[] = {'a', 'b', 'c', 'd'};
		powerSet(chars);
	}
	
	public static void powerSet(char[] chars) {
		int powerSetLngth = (int) Math.pow(2,chars.length);
		
		for(int i=0; i<powerSetLngth; i++) {
			for(int j=0; j<chars.length; j++) {
				if((i & 1<<j) > 0) {
					System.out.print(chars[j]);
				}
			}
			System.out.println();
		}
	}

}
