package org.geeks.strings;

public class KeypadTyping {

	public static void main(String[] args) {
		
		String str = "sudhir";
		keyPad(str);

	}
	
	public static void keyPad(String input) {
		
		String str[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		for(int i=0; i<input.length(); i++) {
			for(int j=0; j<str.length; j++) {
				if(str[j].indexOf(input.charAt(i)) != -1) {
					System.out.print(j+2 + " ");
					break;
				}
			}
		}
	}

}
