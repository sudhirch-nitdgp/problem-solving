package org.geeks.stack;

import java.util.Stack;

public class LargestRectangularAreaInHistogram_1 {

	public static void main(String[] args) {
		
		int a[] = {6, 2, 5, 4, 1, 5, 6};
		System.out.println(largestRectangularArea(a));

	}
	
	public static int largestRectangularArea(int a[]) {
		int n = a.length;
		Stack<Integer> stack = new Stack<Integer>();
		int res = 0;
		
		for(int i=0; i<a.length; i++) {
			while(!stack.isEmpty() && a[stack.peek()] >= a[i]) {
				int top = stack.pop();
				int currArea = a[top] * (stack.isEmpty() ? i : (i-stack.peek()-1));
				res = Math.max(currArea, res);
			}
			stack.push(i);
			
		}
		while(!stack.isEmpty()) {
			int top = stack.pop();
			int currentArea = a[top] * (stack.isEmpty() ? n : (n-stack.peek()-1));
			res = Math.max(currentArea, res);
		}
		return res;
	}

}
