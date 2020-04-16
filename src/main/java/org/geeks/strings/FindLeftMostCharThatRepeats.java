package org.geeks.strings;

public class FindLeftMostCharThatRepeats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "geeksforgeeks";
		//String str = "abcd";
		System.out.println(leftMostChar(str));

	}
	
	public static int leftMostChar(String str) {
		int count[] = new int[256];
		int index = -1;
		for(int i=str.length()-1; i>=0; i--) {
			if(count[str.charAt(i)] > 0) {
				index = i;
			} else {
				count[str.charAt(i)]++;
			}
		}
		return index;
	}

}
