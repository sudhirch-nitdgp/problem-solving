package org.geeks.stack;

import java.util.Stack;

public class PreviousGreaterEle {

	public static void main(String[] args) {
		
		int a[] = {15, 10, 18, 12, 4, 6, 2, 8};
		previousGreater(a);

	}
	
	public static void previousGreater(int a[]) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(a[0]);
		System.out.println(-1);
		for(int i=1; i<a.length; i++) {
			
			while(!stack.isEmpty() && stack.peek() < a[i]) {
				stack.pop();
			}
			
			int ele = !stack.isEmpty() ? stack.peek() : -1;
			
			System.out.println(ele);
			
			stack.push(a[i]);
			
		}
	}

}
