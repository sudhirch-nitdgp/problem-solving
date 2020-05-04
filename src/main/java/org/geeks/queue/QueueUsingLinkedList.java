package org.geeks.queue;

import org.geeks.linkedlist.Node;

public class QueueUsingLinkedList {
	
	private Node front = null;
	private Node rear = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueUsingLinkedList queue = new QueueUsingLinkedList();
		queue.enQueue(10);
		queue.enQueue(15);
		queue.enQueue(20);
		queue.deQueue();
		queue.deQueue();
		System.out.println(queue.getFrontEle());
		System.out.println(queue.getRearEle());

	}
	
	public void enQueue(int ele) {
		Node tmp = new Node(ele);
		if(front == null) {
			front = tmp;
			rear = tmp;
		} else {
			rear.setNext(tmp);
			rear = tmp;
		}
	}
	
	public void deQueue() {
		if(front == null) {
			System.out.println("Queue is Empty");
		} else {
			front = front.getNext();
		}
	}
	
	public int getFrontEle() {
		return front.getData();
	}
	
	public int getRearEle() {
		return rear.getData();
	}
	
	

}
