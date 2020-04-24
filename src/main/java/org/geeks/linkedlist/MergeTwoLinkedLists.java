package org.geeks.linkedlist;

public class MergeTwoLinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(10);
		Node node2 = new Node(20);
		Node node3 = new Node(30);
		Node node4 = new Node(40);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		
		Node node5 = new Node(5);
		Node node6 = new Node(15);
		Node node7 = new Node(17);
		Node node8 = new Node(18);
		Node node9 = new Node(35);
		
		node5.setNext(node6);
		node6.setNext(node7);
		node7.setNext(node8);
		node8.setNext(node9);
		
		Node head = merge(node1, node5);
		print(head);
	}
	
	public static Node merge(Node a, Node b) {
		Node head = null;
		Node tail = null;
		
		if(a.getData() < b.getData()) {
			head = tail = a;
			a = a.getNext();
		} else {
			head = tail = b;
			b = b.getNext();
		}
		
		while(a != null && b != null) {
			if(a.getData() < b.getData()) {
				tail.setNext(a);
				tail = a;
				a = a.getNext();
			} else {
				tail.setNext(b);
				tail = b;
				b = b.getNext();
			}
		}
		
		if(a != null) {
			tail.setNext(a);
		} else if(b != null) {
			tail.setNext(b);
		}
		return head;
	}
	
	public static void print(Node head) {
		Node curr = head;
		
		while(curr != null) {
			System.out.print(curr.getData() + " ");
			curr = curr.getNext();
		}
	}

}
