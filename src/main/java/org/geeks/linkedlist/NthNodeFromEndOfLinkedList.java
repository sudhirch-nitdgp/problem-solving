package org.geeks.linkedlist;

public class NthNodeFromEndOfLinkedList {

	public static void main(String[] args) {
		
		Node node1 = new Node(10);
		Node node2 = new Node(15);
		Node node3 = new Node(20);
		Node node4 = new Node(25);
		Node node5 = new Node(30);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		
		nthNodeFromEnd(node1, 2);

	}
	
	public static void nthNodeFromEnd(Node head, int n) {
		
		Node next = head;
		Node curr = head;
		
		for(int i=1; i<=n; i++) {
			next = next.getNext();
		}
		
		while(next != null) {
			curr = curr.getNext();
			next = next.getNext();
		}
		
		System.out.println(curr.getData());
		
	}

}
