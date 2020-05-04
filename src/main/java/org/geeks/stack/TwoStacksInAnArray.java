package org.geeks.stack;

public class TwoStacksInAnArray {
	
	int a[] = new int[10];
	int top1 = -1;
	int top2 = a.length;
	int size1 = 0;
	int size2 = 0;

	public static void main(String[] args) {
		
		TwoStacksInAnArray stack = new TwoStacksInAnArray();
		stack.push1(10);
		stack.push1(20);
		stack.push1(30);
		stack.push1(40);
		stack.push2(100);
		stack.push2(90);
		stack.pop1();
		stack.pop1();
		stack.pop2();
		stack.push1(50);
		stack.display();

	}
	
	public void push1(int ele) {
		if(top1+1 == top2) {
			System.out.println("Stack is full");
		}
		top1++;
		a[top1] = ele;
		size1++;
	}
	
	public int pop1() {
		if(top1 == -1) {
			System.out.println("Stack1 is empty");
		}
		int ele = a[top1];
		top1--;
		size1--;
		return ele;
	}
	
	public void push2(int ele) {
		if(top1+1 == top2) {
			System.out.println("Stack is full");
		}
		top2--;
		a[top2] = ele;
		size2++;
	}
	
	public int pop2() {
		if(top2 == a.length) {
			System.out.println("Stack2 is empty");
		}
		int ele = a[top2];
		top2++;
		size2--;
		return ele;
	}
	
	public void display() {
		for(int i=top1; i>=0; i--) {
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println();
		for(int i=top2; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
