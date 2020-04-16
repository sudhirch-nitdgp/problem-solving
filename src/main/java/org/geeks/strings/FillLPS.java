package org.geeks.strings;

public class FillLPS {

	public static void main(String[] args) {
		
		String str = "AAABAAAAC";
		fillLPS(str);
	}
	
	public static void fillLPS(String str) {
		int n = str.length();
		int lps[] = new int[n];
		lps[0] = 0;
		int i = 1;
		int len = 0;
		while(i < n) {
			if(str.charAt(i) == str.charAt(len)) {
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
		
		for(int j=0; j<n; j++) {
			System.out.println(lps[j]);
		}
	}

}
