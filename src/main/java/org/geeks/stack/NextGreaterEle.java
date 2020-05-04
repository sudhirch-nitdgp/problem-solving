package org.geeks.stack;

import java.util.Stack;

public class NextGreaterEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5, 15, 10, 8, 6, 12, 9, 18};
		nextGreater(a);

	}
	
	public static void nextGreater(int a[]) {
		
		Stack<Integer> stack = new Stack<Integer>();
		int n = a.length; 
		
		stack.push(a[n-1]);
		System.out.println(-1);
		for(int i=n-2; i>=0; i--) {
			while(!stack.isEmpty() && stack.peek() < a[i]) {
				stack.pop();
			}
			
			int ele = !stack.isEmpty() ? stack.peek() : -1;
			
			System.out.println(ele);
			stack.push(a[i]);
		}
	}

}
