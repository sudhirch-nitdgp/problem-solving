package org.geeks.linkedlist;

public class Add2NumbersRepresentedByLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(5);
		Node node2 = new Node(4);
		
		node1.setNext(node2);
		
		Node node3 = new Node(5);
		Node node4 = new Node(4);
		Node node5 = new Node(3);
		
		node3.setNext(node4);
		node4.setNext(node5);
		
		Node head = addTwoNumbers(node1, node3);
		
		print(head);

	}
	
	public static Node addTwoNumbers(Node first, Node second) {
		
		int carry = 0;
		Node tmp = null;
		Node head = null;
		Node prev = tmp;
		while(first != null || second != null) {
			int sum = carry + (first != null ? first.getData() : 0) +
					(second != null ? second.getData() : 0);
			
			carry = (sum >=10) ? 1 : 0;
			
			sum = sum % 10;
			
			tmp = new Node(sum);
			if(head == null) {
				head = tmp;
			} else {
				prev.setNext(tmp);
			}
			prev = tmp;
			if(first != null) first = first.getNext();
			if(second != null) second = second.getNext();
		}
		if(carry != 0) {
			prev.setNext(new Node(carry));
		}
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
