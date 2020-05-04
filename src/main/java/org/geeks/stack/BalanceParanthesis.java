package org.geeks.stack;

import java.util.Stack;

public class BalanceParanthesis {

	public static void main(String[] args) {
		
		//String str = "{[()]}";
		String str = "((())";
		System.out.println(isParanthesisBalanced(str));

	}
	
	public static boolean isParanthesisBalanced(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '{' || str.charAt(i) == '['
					 || str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else {
				if(stack.isEmpty()) {
					return false;
				} else {
					if(!isMatch(stack.pop(),str.charAt(i))) {
						return false;
					}
				}
			}
		}
		return stack.isEmpty() ? true : false;
	}

	private static boolean isMatch(char char1, Character char2) {
		return ((char1 == '{' && char2 == '}') ||
				(char1 == '[' && char2 == ']') ||
				(char1 == '(' && char2 == ')'));
	}

}
