package org.practice.strings;

public class CheckStringsAreRotatedOrNot {

	public static void main(String[] args) {
		
		String str1 = "ABCD";
		String str2 = "CDAB";
		
		System.out.println(checkRotation(str1, str2));

	}
	
	public static boolean checkRotation(String str1, String str2) {
		if(str1.length() == str2.length()) {
			if((str1+str1).indexOf(str2) != -1) {
				return true;
			}
		}
		return false;
	}

}
