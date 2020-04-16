package org.geeks.strings;

public class KMPAlgoritham {

	public static void main(String[] args) {
		
		String str = "ababcababaad";
		String pat = "ababa";
		kmp(str, pat);
	}
	
	public static void kmp(String str, String pat) {
		
		int n = str.length();
		int m = pat.length();
		
		int lps[] = new int[m];
		
		fillLPS(pat, lps);
		
		int i = 0;
		int j = 0;
		
		while(i < n) {
			if(str.charAt(i) == pat.charAt(j)) {
				i++;
				j++;
			} else {
				if(j == 0) {
					i++;
				} else {
					j = lps[j-1];
				}
			}
			if(j == m) {
				System.out.println(i-j);
				j = lps[j-1];
			} 
		}
	}
	
	public static void fillLPS(String pat, int lps[]) {
		
		int n = pat.length();
		lps[0] = 0;
		int i = 1;
		int len = 0;
		while(i < n) {
			if(pat.charAt(i) == pat.charAt(len)) {
				len++;
				lps[i] = len;
				i++;
			} else {
				if(len == 0) {
					lps[i] = 0;
					i++;
				} else {
					len = lps[len-1];
				}
			}
		}
	}

}
