package org.geeks.linkedlist;

public class SegregateEvenAndOddNodes {

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
		
		segregateEvenAndOdd(node1);
	}
	
	public static void segregateEvenAndOdd(Node head) {
		Node es = null,ed = null,os = null,od = null;
		
		Node curr = head;
		
		while(curr != null) {
			int data = curr.getData();
			if(data % 2 == 0) {
				if(es == null) {
					es = curr;
					ed = es;
				} else {
					ed.setNext(curr);
					ed = ed.getNext();
				}
			} else {
				if(os == null) {
					os = curr;
					od = os;
				} else {
					od.setNext(curr);
					od = od.getNext();
				}
			}
			curr = curr.getNext();
		}
		
		ed.setNext(os);
		od.setNext(null);
		
		print(es);
	}
	
	public static void print(Node head) {
		Node curr = head;
		
		while(curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

}
