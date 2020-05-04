package org.geeks.stack;

public class StackUsingArray {
	
	int a[] = new int[5];
	int size = 0;
	int top = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.pop();
		stack.pop();
		stack.push(60);
		stack.display();
	}
	
	public void push(int ele) {
		if(top == a.length-1) {
			System.out.println("Stack overflow");
			return;
		}
		top++;
		size++;
		a[top] = ele;
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		int ele = a[top];
		top--;
		size--;
		return ele;
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("Stack is empty");
		}
		return a[top];
	}
	
	public int size() {
		return size;
	}
	
	public void display() {
		for(int i=size-1; i>=0; i--) {
			System.out.println(a[i]);
		}
	}

}
