package org.geeks.strings;

public class CheckStringsAreRotationOfEachOther {

	public static void main(String[] args) {
		
		String str1 = "ABCD";
		
		String str2 = "CDAB";
		
		System.out.println(isRotated(str1, str2));

	}
	
	public static boolean isRotated(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.concat(str1);
		
		return str1.indexOf(str2) > 0 ? true : false;
	}

}
