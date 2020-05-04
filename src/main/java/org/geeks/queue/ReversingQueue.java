package org.geeks.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(10);
		queue.add(15);
		queue.add(20);
		queue.add(25);
		
		queue = reverse(queue);
		display(queue);

	}
	
	public static Queue<Integer> reverse(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
 		while(!queue.isEmpty()) {
			int ele = queue.poll();
			stack.push(ele);
		}
 		
 		while(!stack.isEmpty()) {
 			queue.add(stack.pop());
 		}
 		return queue;
	}
	
	public static void display(Queue<Integer> queue) {
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
