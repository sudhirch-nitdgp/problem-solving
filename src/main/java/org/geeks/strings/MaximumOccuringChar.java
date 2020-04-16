package org.geeks.strings;

/**
 * If more than one character occurs maximum number of time then 
 * print the lexicographically smaller character.
 * @author sudhirc
 *
 */
public class MaximumOccuringChar {

	public static void main(String[] args) {
		
		String str = "testsample";
		maxOccurChar(str);
	}
	
	public static void maxOccurChar(String str) {
		int count[] = new int[256];
		
		for(int i=0; i<str.length(); i++) {
			count[str.charAt(i)]++;
		}
		
		int maxOccur = 0;
		int pos = 0;
		for(int i=0; i<256; i++) {
			if(count[i] > maxOccur) {
				maxOccur = count[i];
				pos = i;
			}
		}
		System.out.println((char)pos);
	}

}
