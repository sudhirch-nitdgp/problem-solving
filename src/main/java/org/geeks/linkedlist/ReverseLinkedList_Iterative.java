package org.geeks.linkedlist;

public class ReverseLinkedList_Iterative {

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
		
		Node head = reverse(node1);
		
		print(head);
		
	}
	
	public static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		Node next;
		while(curr != null) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static void print(Node head) {
		Node curr = head;
		
		while(curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

}
