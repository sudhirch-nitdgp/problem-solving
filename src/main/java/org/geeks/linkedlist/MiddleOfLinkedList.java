package org.geeks.linkedlist;

public class MiddleOfLinkedList {

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

		findMiddle(node1);
	}
	
	public static void findMiddle(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		System.out.println(slow.getData());
	}

}
