package org.geeks.linkedlist;

public class ReverseLinkedList_Recursive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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

	private static Node reverse(Node head) {
		// TODO Auto-generated method stub
		if(head == null || head.getNext() == null) {
			return head;
		}
		Node rest_head = reverse(head.getNext());
		Node rest_tail = head.getNext();
		rest_tail.setNext(head);
		head.setNext(null);
		return rest_head;
	}
	
	public static void print(Node head) {
		Node curr = head;
		
		while(curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

}
