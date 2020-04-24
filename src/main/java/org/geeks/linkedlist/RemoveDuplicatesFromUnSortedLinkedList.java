package org.geeks.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnSortedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node node1 = new Node(5);
		Node node2 = new Node(2);
		Node node3 = new Node(2);
		Node node4 = new Node(4);
		Node node5 = new Node(1);
		Node node6 = new Node(5);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(node4);
		node4.setNext(node5);
		node5.setNext(node6);
		
		Node head = removeDuplicates(node1);
		print(head);

	}
	
	public static Node removeDuplicates(Node head) {
		
		Node curr = head;
		Node prev = null;
		Set<Integer> set = new HashSet<Integer>();
		
		while(curr != null) {
			int currVal = curr.getData();
			
			if(set.contains(currVal)) {
				prev.setNext(curr.getNext());
			} else {
				set.add(currVal);
				prev = curr;
			}
			curr = curr.getNext();
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
