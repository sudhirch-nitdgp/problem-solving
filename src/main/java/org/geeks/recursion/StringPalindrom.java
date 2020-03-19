package org.geeks.recursion;

public class StringPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aabaa";
		System.out.println(isPalindrom(str, 0, str.length()-1));
	}
	
	public static boolean isPalindrom(String str, int s, int e) {
		if(s == e || s > e) return true;
		
		if(str.charAt(s) == str.charAt(e)) {
			return isPalindrom(str, s+1, e-1);
		} else {
			return false;
		}
	}

}
