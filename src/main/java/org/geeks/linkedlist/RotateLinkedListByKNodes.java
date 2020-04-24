package org.geeks.linkedlist;

public class RotateLinkedListByKNodes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		Node head = rotate(node1,3);
		print(head);
		
	}
	
	public static Node rotate(Node head, int k) {
		
		Node curr = head;
		int count = 1;
		while(count < k) {
			curr = curr.getNext();
			count++;
		}
		Node kthNode = curr;
		
		while(curr.getNext() != null) {
			curr = curr.getNext();
		}
		
		curr.setNext(head);
		head = kthNode.getNext();
		kthNode.setNext(null);
		
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
