package org.practice.array;

import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		int a[] = {4,5,2,25};
		nextGreaterEle(a);
	}
	
	public static void nextGreaterEle(int a[]) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(a[0]);
		
		for(int i=1; i<a.length; i++) {
			int next = a[i];
			
			if(!stack.isEmpty()) {
				
				int ele = stack.pop();
				
				while(next > ele) {
					System.out.println(ele +" --> " + next);
					if(stack.isEmpty()) break;
					ele = stack.pop();
				}
				
				if(ele > next) {
					stack.push(ele);
				}
			}
			stack.push(next);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop() +" --> " + -1);
		}
	}

}
