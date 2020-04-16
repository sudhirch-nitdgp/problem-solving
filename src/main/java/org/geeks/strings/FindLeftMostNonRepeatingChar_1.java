package org.geeks.strings;

public class FindLeftMostNonRepeatingChar_1 {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		firstNonRepeatingChar(str);
	}
	
	public static void firstNonRepeatingChar(String str) {
		
		int count[] = new int[256];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		for(int i=0; i<str.length(); i++) {
			if(count[str.charAt(i)] == 1) {
				System.out.println(str.charAt(i));
				return;
			}
		}
	}

}
