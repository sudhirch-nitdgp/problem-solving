package org.geeks.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ReversingQueue_Recursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.add(10);
		queue.add(15);
		queue.add(20);
		queue.add(25);
		
		reverse(queue);
		
		display(queue);

	}
	
	public static void reverse(Queue<Integer> queue) {
		if(queue.isEmpty()) {
			return;
		}
		int top = queue.poll();
		reverse(queue);
		queue.add(top);
	}
	
	public static void display(Queue<Integer> queue) {
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
