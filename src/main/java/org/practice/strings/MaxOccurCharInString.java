package org.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurCharInString {
	
	public static void main(String[] args) {
		
		String str = "sample string";
		
		System.out.println(maxOccuringChar(str));

	}
	
	public static char maxOccuringChar(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		
		int max = 0;
		char result = ' ';
		for(Character c : map.keySet()) {
			if(map.get(c) > max) {
				max = map.get(c);
				result = c;
			}
		}
		
		return result;
	}

}
