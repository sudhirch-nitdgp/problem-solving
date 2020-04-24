package org.practice.strings;

import java.util.HashMap;
import java.util.Map;

public class PrintListContainsAllCharsOfGivenWord {

	public static void main(String[] args) {
		
		String str[] = {"sunday", "geeksforgeeks", "utensils", "just"};
		
		String word = "sun";
		
		printWordContainsChars(str, word);

	}
	
	public static void printWordContainsChars(String[] str, String word) {
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		int length = word.length();
		
		for(int i=0; i < word.length(); i++) {
			map.put(word.charAt(i), 1);
		}
		
		for(int i=0; i<str.length; i++) {
			String wrd = str[i];
			int count = 0;
			for(int j=0; j < wrd.length(); j++) {
				if(map.containsKey(wrd.charAt(j))) {
					count ++;
					if(count == length) {
						System.out.println(wrd);
					}
				}
			}
		}
	}

}
