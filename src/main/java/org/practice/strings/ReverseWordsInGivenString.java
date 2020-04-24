package org.practice.strings;

public class ReverseWordsInGivenString {

	public static void main(String[] args) {
		
		String str = "i love my country";
		
		reverseWords(str);

	}
	
	public static void reverseWords(String str) {
		
		String arr[] = str.split(" ");
		
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
		/*int l = 0;
		int r = arr.length-1;
		
		while(l < r) {
			String tmp = arr[l];
			arr[l] = arr[r];
			arr[r] = tmp;
			l++;
			r--;
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}*/
	}

}
