package org.practice.strings;

import java.util.LinkedHashSet;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		String str = "test string";
		
		removeDuplicates(str);

	}
	
	public static void removeDuplicates(String str) {
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i=0; i<str.length(); i++) {
			if(set.add(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
