package org.practice.strings;

public class StringReversal_Rec {

	public static void main(String[] args) {
		
		String str = "Sudhir";
		System.out.println(reverseString(str.toCharArray(), 0, str.length()-1));

	}
	
	public static String reverseString(char[] arr, int low, int high) {
		//char[] arr = str.toCharArray();
		if(low < high) {
			char tmp = ' ';
			tmp = arr[low];
			arr[low] = arr[high];
			arr[high] = tmp;
			reverseString(arr, low+1, high-1);
		}
		return String.valueOf(arr);
	}

}
