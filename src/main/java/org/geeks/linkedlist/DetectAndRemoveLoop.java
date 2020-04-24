package org.geeks.linkedlist;

public class DetectAndRemoveLoop {

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
		node7.setNext(node3);
		
		detectAndRemove(node1);

	}
	
	public static void detectAndRemove(Node head) {
		Node slow = head;
		Node fast = head;
		boolean isLoopExist = false;
		
		while(fast != null && fast.getNext() != null) {
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			
			if(slow == fast) {
				isLoopExist = true;
				break;
			}
		}
		if(isLoopExist) {
			slow = head;
			while(slow.getNext() != fast.getNext()) {
				slow = slow.getNext();
				fast = fast.getNext();
			}
			fast.setNext(null);
		}
	}
}
