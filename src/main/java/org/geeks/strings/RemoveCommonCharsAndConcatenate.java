package org.geeks.strings;

public class RemoveCommonCharsAndConcatenate {

	public static void main(String[] args) {
		
		String str1 = "aacdb";
		String str2 = "gafd";
		removeAndConcat(str1, str2);
	}
	
	public static void removeAndConcat(String str1, String str2) {
		int count[] = new int[256];
		String res ="";
		for(int i=0; i<str1.length(); i++) {
			count[str1.charAt(i)]++;
		}
		
		for(int i=0; i<str2.length(); i++) {
			count[str2.charAt(i)]++;
		}
		
		for(int i=0; i<str1.length(); i++) {
			if(count[str1.charAt(i)] == 1) {
				res += str1.charAt(i);
			}
		}
		
		for(int i=0; i<str2.length(); i++) {
			if(count[str2.charAt(i)] == 1) {
				res += str2.charAt(i);
			}
		}
		System.out.println(res);
	}

}
