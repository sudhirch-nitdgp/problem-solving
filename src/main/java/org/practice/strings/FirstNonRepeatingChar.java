package org.practice.strings;

import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		
		String str = "GeeksforGeeks";
		
		nonRepeatingChar(str);

	}
	
	public static void nonRepeatingChar(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Character c : map.keySet()) {
			if(map.get(c) == 1) {
				System.out.println(c);
				return;
			}
		}
	}

}
