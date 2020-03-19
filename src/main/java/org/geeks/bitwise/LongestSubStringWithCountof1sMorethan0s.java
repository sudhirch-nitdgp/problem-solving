package org.geeks.bitwise;

public class LongestSubStringWithCountof1sMorethan0s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestSubString("100010110");
	}
	
	public static void longestSubString(String str) {
		int sum = 0;
		int maxLen = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '1') {
				sum++;
			} else {
				sum--;
			}
			
			if(sum > 0) {
				maxLen = i+1;
			}
		}
		
		System.out.println(maxLen);
	}

}
