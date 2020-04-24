package org.geeks.linkedlist;

public class ReverseLinkedListInGroupsOfSizeK {

	public static void main(String[] args) {
		
		Node node1 = new Node(10);
		Node node2 = new Node(15);
		Node node3 = new Node(20);
		Node node4 = new Node(25);
		Node node5 = new Node(30);
		Node node6 = new Node(35);
		Node node7 = new Node(40);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(node7);
		
		Node new_head = reverseInGroups(node1, 2);
		
		print(new_head);

	}

	private static Node reverseInGroups(Node head, int k) {
		
		Node curr = head;
		int count = 0;
		Node next = null;
		Node prev = null;
		while(curr != null && count < k) {
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
			count++;
		}
		if(next != null) {
			Node rest_head = reverseInGroups(next, k);
			head.setNext(rest_head);
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
