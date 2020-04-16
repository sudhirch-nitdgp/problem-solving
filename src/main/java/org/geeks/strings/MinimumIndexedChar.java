package org.geeks.strings;

import java.util.HashSet;
import java.util.Set;

public class MinimumIndexedChar {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		String pat = "set";
		minIndexChar(str, pat);
	}
	
	public static void minIndexChar(String str, String pat) {
		
		Set<Character> set = new HashSet<Character>();
		
		for(int i=0; i<pat.length(); i++) {
			set.add(pat.charAt(i));
		}
		
		for(int i=0; i<str.length(); i++) {
			if(set.contains(str.charAt(i))) {
				System.out.println(str.charAt(i));
				return;
			}
		}
		
		System.out.println("No character present");
	}

}
