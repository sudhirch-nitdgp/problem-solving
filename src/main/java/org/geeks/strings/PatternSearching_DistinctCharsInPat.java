package org.geeks.strings;

public class PatternSearching_DistinctCharsInPat {

	public static void main(String[] args) {
		
		String str = "ABCEBABCDEFGABCD";
		String pat = "ABCD";
		
		searchPattern(str, pat);

	}
	
	public static void searchPattern(String str, String pat) {
		
		int n = str.length();
		int m = pat.length();
		int j;
		for(int i=0; i<=n-m; ) {
			for(j=0; j<m; j++) {
				if(str.charAt(i+j) != pat.charAt(j)) {
					break;
				}
			}
			if(j == m) {
				System.out.println(i);
				i++;
			} else if(j==0) {
				i++;
			} else {
				i = i+j;
			}
		}
	}

}
