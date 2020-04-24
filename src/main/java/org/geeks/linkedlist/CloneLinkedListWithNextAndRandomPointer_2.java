package org.geeks.linkedlist;

public class CloneLinkedListWithNextAndRandomPointer_2 {

	public static void main(String[] args) {
		
		LNode node1 = new LNode(10);
		LNode node2 = new LNode(15);
		LNode node3 = new LNode(20);
		LNode node4 = new LNode(25);
		LNode node5 = new LNode(30);
		
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		node1.random = node4;
		node2.random = node5;
		node3.random = node1;
		node4.random = node2;
		node5.random = node3;
		
		clone(node1);

	}
	
	public static void clone(LNode head) {
		
		LNode curr = head;
		LNode next = null;
		LNode newNode = null;
		
		// Step 1 : have the copy of each node as a new node
		while(curr != null) {
			next = curr.next;
			newNode = new LNode(curr.data);
			curr.next = newNode;
			newNode.next = next;
			curr = next;
		}
		
		// Step 2 : Link the Random pointers
		
		curr = head;
		
		while(curr != null) {
			curr.next.random = curr.random.next;
			curr = curr.next.next;
		}
		
		// Step 3: Segregate the original and cloned list
		
		LNode copy = null;
		LNode tmp = null;
		
		curr = head; copy = curr.next;
		
		tmp = copy;
		
		while(curr != null && curr.next != null && copy != null && copy.next != null) {
			curr.next = curr.next.next;
			copy.next = copy.next.next;
			curr = curr.next;
			copy = copy.next;
		}
		
		print(tmp);
	}
	
	public static void print(LNode head) {
		LNode curr = head;
		
		while(curr != null) {
			System.out.print(curr.data + "-->" + curr.random.data);
			curr = curr.next;
			System.out.println();
		}
	}

}
