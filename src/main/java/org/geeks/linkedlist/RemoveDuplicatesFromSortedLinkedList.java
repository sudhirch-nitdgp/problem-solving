package org.geeks.linkedlist;

public class RemoveDuplicatesFromSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(1);
		Node node2 = new Node(1);
		Node node3 = new Node(2);
		Node node4 = new Node(2);
		Node node5 = new Node(4);
		Node node6 = new Node(4);
		Node node7 = new Node(5);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		node6.setNext(node7);
		
		Node head = removeDuplicates(node1);
		
		print(head);

	}
	
	public static Node removeDuplicates(Node head) {
		
		Node prev = head;
		Node curr = prev.getNext();
		
		while(curr != null) {
			
			if(prev.getData() != curr.getData()) {
				prev.setNext(curr);
				prev = curr;
			}
			curr = curr.getNext();
		}
		prev.setNext(null);
		return head;
	}
	
	public static void print(Node head) {
		Node curr = head;
		
		while(curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

}
