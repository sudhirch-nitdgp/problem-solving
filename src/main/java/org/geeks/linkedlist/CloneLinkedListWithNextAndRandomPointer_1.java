package org.geeks.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CloneLinkedListWithNextAndRandomPointer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		Map<LNode, LNode> map = new HashMap<LNode, LNode>();
		LNode origCurr = head;
		LNode cloneCurr = null;
		
		while(origCurr != null) {
			cloneCurr = new LNode(origCurr.data);
			map.put(origCurr, cloneCurr);
			origCurr = origCurr.next;
		}
		
		origCurr = head;
		
		while(origCurr != null) {
			cloneCurr = map.get(origCurr);
			cloneCurr.next = map.get(origCurr.next);
			cloneCurr.random = map.get(origCurr.random);
			origCurr = origCurr.next;
		}
		
		print(map.get(head));
		
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

class LNode {
	
	int data;
	LNode next;
	LNode random;
	
	public LNode(int data) {
		this.data = data;
		this.next = this.random = null;
	}
	
}
