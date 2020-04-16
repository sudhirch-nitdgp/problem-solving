package org.geeks.strings;

public class PatternSearchingProblem {

	public static void main(String[] args) {
		
		String str = "ABABABACDABAB";
		String pat = "ABAB";
		
		patternSearch(str, pat);
	}
	
	public static void patternSearch(String str, String pat) {
		
		int n = str.length();
		int m = pat.length();
		int j;
		for(int i=0; i<=n-m; i++) {
			for(j=0; j<m; j++) {
				if(str.charAt(i+j) != pat.charAt(j)) {
					break;
				}
			}
			if(j == m) {
				System.out.println(i);
			}
		}
		
	}

}
