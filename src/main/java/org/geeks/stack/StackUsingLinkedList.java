package org.geeks.stack;

import org.geeks.linkedlist.Node;

public class StackUsingLinkedList {
	
	private Node head = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackUsingLinkedList stack = new StackUsingLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();
		stack.pop();
		stack.display();
	}
	
	public void push(int ele) {
		Node tmp = new Node(ele);
		tmp.setNext(head);
		head = tmp;
	}
	
	public int pop() {
		if(head == null) {
			System.out.println("Stack is empty");
		}
		int ele = head.getData();
		head = head.getNext();
		return ele;
	}
	
	public void display() {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.getData() + " ");
			curr = curr.getNext();
		}
		System.out.println();
	}

}
