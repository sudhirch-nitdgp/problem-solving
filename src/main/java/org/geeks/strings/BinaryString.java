package org.geeks.strings;

/**
 * count the number of substrings that start and end with 1
 * @author sudhirc
 *
 */
public class BinaryString {

	public static void main(String[] args) {
		
		String str = "“10100101";
		NoofSubStrings(str);
	}
	
	public static void NoofSubStrings(String str) {
		int count = 0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '1') {
				count++;
			}
		}
		
		System.out.println((count*(count-1))/2);
	}

}
