package org.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class PrintAllDuplicates {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		
		printDuplicates(str);

	}
	
	private static void printDuplicates(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Character c : map.keySet()) {
			if(map.get(c) > 1) {
				System.out.println(c + " --> " + map.get(c));
			}
		}
	}

}
