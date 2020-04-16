package org.geeks.strings;

public class CheckStringsAreRotationOfEachOther_1 {

	public static void main(String[] args) {
		
		String str1 = "ABCD";
		
		String str2 = "CDAB";
		
		System.out.println(isRotated(str1, str2));

	}

	private static boolean isRotated(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		
		int index = str2.indexOf(str1.charAt(0));
		
		if(index == -1) {
			return false;
		}
		int i=1;
		while(i < str1.length()) {
			if(str1.charAt(i) != str2.charAt((index+1)%str2.length())) {
				return false;
			}
			i++;
			index++;
		}
		
		return true;
	}
	
	

}
