package org.geeks.strings;

public class FindLeftMostNonRepeatingChar {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		int index = nonRepeatingChar(str);
		System.out.println(str.charAt(index));
	}
	
	public static int nonRepeatingChar(String str) {
		int count[] = new int[256];
		int INT_MAX = 10000;
		int index = INT_MAX;
		
		for(int i=0; i<256; i++) {
			count[i] = -1;
		}
		
		for(int i=str.length()-1; i>=0; i--) {
			if(count[str.charAt(i)] == -1) {
				count[str.charAt(i)] = i;
			} else {
				count[str.charAt(i)] = -2;
			}
		}
		
		for(int i=0; i<256; i++) {
			if(count[i] >= 0) {
				index = Math.min(index, count[i]);
			}
		}
		
		return index==INT_MAX ? -1 : index;
	}

}
