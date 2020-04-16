package org.geeks.strings;

public class CheckStringIsRotatedBy2Places {

	public static void main(String[] args) {
		
		String str1 = "amazon";
		String str2 = "azonam";
		System.out.println(isRotatedBy2Places(str1, str2));
	}
	
	public static boolean isRotatedBy2Places(String str1, String str2) {
		int len = str2.length();
		str2 = str2.substring(len-2).concat(str2.substring(0, len-2));
		return str1.equals(str2);
		
	}

}
