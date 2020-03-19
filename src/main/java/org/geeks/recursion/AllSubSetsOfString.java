package org.geeks.recursion;

public class AllSubSetsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubSets("ABC", "", 0);
	}
	
	public static void printSubSets(String str, String curr, int index) {
		if(index == str.length()) {
			System.out.println(curr);
			return;
		}
		printSubSets(str, curr, index+1);
		printSubSets(str, curr+str.charAt(index), index+1);
	}

}
