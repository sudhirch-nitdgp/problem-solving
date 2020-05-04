package org.geeks.queue;

import java.util.Stack;

public class QueueUsingStacks {

	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public static void main(String[] args) {
		
		QueueUsingStacks queue = new QueueUsingStacks();
		
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		System.out.println(queue.deQueue());

	}
	
	public void enQueue(int ele) {
		stack1.push(ele);
	}
	
	public int deQueue() {
		int ele = -1;
		if(stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("Queue is empty");
		} else if(!stack2.isEmpty()) {
			ele = stack2.pop();
		} else {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			ele = stack2.pop();
		}
		return ele;
	}
	
}
