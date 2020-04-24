package org.practice.strings;

public class DivideStringInNequalParts {

	public static void main(String[] args) {
		String str = "a_simple_divide_string_quest";
		equalParts(str, 4);
	}
	
	public static void equalParts(String str, int n) {
		if(str.length() % n != 0) {
			System.out.println("Can't divide in to equal parts");
			return;
		}
		int part_size = str.length() / n;
		
		for(int i=0; i<str.length(); i++) {
			if(i % part_size == 0) {
				System.out.println();
			} else {
				System.out.print(str.charAt(i));
			}
		}
	}

}
