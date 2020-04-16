package org.geeks.strings;

import java.util.Arrays;

public class LongestSubStringWithDistinctChars {

	public static void main(String[] args) {
		
		String str = "abcadbd";
		
		System.out.println(longestSubString(str));

	}
	
	public static int longestSubString(String str) {
		
		int n = str.length();
		int startIndex = 0;
		int prev[] = new int[256];
		Arrays.fill(prev, -1);
		int maxEnd = 0;
		int res = 0;
		
		for(int j=0; j<n; j++) {
			startIndex = Math.max(startIndex, prev[str.charAt(j)]+1);
			maxEnd = j-startIndex+1;
			res = Math.max(maxEnd, res);
			prev[str.charAt(j)] = j;
		}
		
		return res;
	}

}
