package org.geeks.stack;

import java.util.Stack;

public class LargestRectangularAreaInHistogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {6,2,5,4,1,6,10};
		
		largestRectangularArea(a);

	}
	
	public static void largestRectangularArea(int a[]) {
		
		int ps[] = new int[a.length];
		
		int ns[] = new int[a.length];
		
		ps = previousSmallest(a, ps);
		ns = nextSmallest(a, ns);
		
		System.out.println(findMaxArea(ps, ns, a));
	}
	
	public static int[] previousSmallest(int a[], int ps[]) {
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		ps[0] = -1;
		
		for(int i=1; i<a.length; i++) {
			while(!stack.isEmpty() && a[stack.peek()] > a[i]) {
				stack.pop();
			}
			ps[i] = !stack.isEmpty() ? stack.peek() : -1;
			stack.push(i);
		}
		return ps;
	}
	
	public static int[] nextSmallest(int a[], int ns[]) {
		Stack<Integer> stack = new Stack<Integer>();
		int n = a.length;
		stack.push(n-1);
		ns[n-1] = n;
		
		for(int i=n-2; i>=0; i--) {
			while(!stack.isEmpty() && a[stack.peek()] > a[i]) {
				stack.pop();
			}
			ns[i] = !stack.isEmpty() ? stack.peek() : n;
			stack.push(i);
		}
		return ns;
	}
	
	public static int findMaxArea(int ps[], int ns[], int a[]) {
		int maxArea = 0;
		for(int i=0; i<a.length; i++) {
			int area = (ns[i]-ps[i]-1) * a[i];
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
	}

}
