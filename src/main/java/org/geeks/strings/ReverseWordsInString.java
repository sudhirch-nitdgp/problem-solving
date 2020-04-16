package org.geeks.strings;

public class ReverseWordsInString {

	public static void main(String[] args) {
		
		String str = "How are you doing";
		reverseWords(str);
	}
	
	public static void reverseWords(String input) {
		String str[] = input.split(" ");
		
		for(int i=str.length-1; i>=0; i--) {
			if(i==0) {
				System.out.print(str[i]);
			} else {
				System.out.print(str[i] + " ");
			}
		}
	}

}
