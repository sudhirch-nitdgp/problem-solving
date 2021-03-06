package org.geeks.strings;

public class CheckStringsAnagram {

	public static void main(String[] args) {
		
		String str1 = "geeks";
		String str2 = "ekegs";
		
		System.out.println(isAnagram(str1, str2));
	}
	
	public static boolean isAnagram(String str1, String str2) {
		int count[] = new int[256];
		
		if(str1.length() != str2.length()) {
			return false;
		}
		for(int i=0; i<str1.length(); i++) {
			count[str1.charAt(i)]++;
		}
		
		for(int i=0; i<str2.length(); i++) {
			count[str2.charAt(i)]--;
		}
		
		for(int i=0; i<256; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;
	}

}
