package org.geeks.strings;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		
		String str = "a123bc5";
		sumOfNumbers(str);

	}
	
	public static void sumOfNumbers(String str) {
		int res = 0;
		for(int i=0; i<str.length(); i++) {
			int num = 0;
			while(i<str.length() && (int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57) {
				num = num * 10 + Character.getNumericValue(str.charAt(i));
				i++;
			}
			if(num > 0) {
				res += num;
			}
		}
		System.out.println(res);
	}

}
