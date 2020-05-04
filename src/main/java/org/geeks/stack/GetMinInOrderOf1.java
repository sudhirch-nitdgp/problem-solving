package org.geeks.stack;

import java.util.Stack;

public class GetMinInOrderOf1 {
	
	Stack<Integer> stack = new Stack<Integer>();
	
	Stack<Integer> minStack = new Stack<Integer>();

	public static void main(String[] args) {
		GetMinInOrderOf1  min = new GetMinInOrderOf1();
		min.push(10);
		min.push(15);
		min.push(5);
		min.push(12);
		min.push(5);
		
		System.out.println(min.getMin());
		
		min.pop();
		min.pop();
		min.pop();
		System.out.println(min.getMin());
	}
	
	public void push(int ele) {
		if(stack.isEmpty()) {
			stack.push(ele);
			minStack.push(ele);
		} else {
			stack.push(ele);
			if(ele <= minStack.peek()) {
				minStack.push(ele);
			}
		}
	}
	
	public void pop() {
		int ele = stack.pop();
		if(ele == minStack.peek()) {
			minStack.pop();
		}
	}
	
	public int getMin() {
		return minStack.peek();
	}
	
	

}
