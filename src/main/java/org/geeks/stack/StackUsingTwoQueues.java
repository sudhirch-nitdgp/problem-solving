package org.geeks.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class StackUsingTwoQueues {
	
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();

	public static void main(String[] args) {
		
		StackUsingTwoQueues stack = new StackUsingTwoQueues();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		stack.push(40);
		
		stack.display();
	}
	
	
	public void push(int ele) {
		
		while(!queue1.isEmpty()) {
			int element = queue1.peek();
			queue1.remove();
			queue2.add(element);
		}
		queue1.add(ele);
		
		while(!queue2.isEmpty()) {
			int element = queue2.peek();
			queue2.remove();
			queue1.add(element);
		}
	}
	
	public int pop() {
		return !queue1.isEmpty() ? queue1.remove() : -1;
	}
	
	public void display() {
		Iterator<Integer> it = queue1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
