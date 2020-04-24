package org.geeks.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
	
	private int cacheSize = 0;
	private Map<Integer, DLLNode> map = null;
	int listSize = 0;
	DLLNode head;
	DLLNode tail;
	
	public LRUCache(int size) {
		this.cacheSize = size;
		map = new HashMap<Integer, DLLNode>();
	}
	
	
	public void refer(int ele) {
		
		if(!map.containsKey(ele)) {
			DLLNode node = new DLLNode(ele);
			map.put(ele, node);
			if(cacheSize == listSize) {
				map.remove(tail.data);
				tail = tail.prev;
				tail.next = null;
				listSize--;
			}
			if(listSize != cacheSize) {
				if(listSize == 0) {
					tail = node;
					head = node;
				} else {
					node.next = head;
					head.prev = node;
					head = node;
				}
				listSize++;
			} 
		} else {
			DLLNode node = map.get(ele);
			
			if(node == tail) {
				tail = tail.prev;
				tail.next = null;
			} else {
				node.prev.next = node.next;
				node.next.prev = node.prev;
			}
			
			node.prev = null;
			node.next = head;
			head.prev = node;
			head = node;
		}
		
	}
	
	
	public void display() {
		DLLNode curr = head;
		while(curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LRUCache cache = new LRUCache(4);
		cache.refer(10);
		cache.refer(20);
		cache.refer(30);
		cache.refer(20);
		cache.refer(40);
		cache.refer(50);
		cache.refer(40);
		cache.refer(30);
		
		cache.display();
	}

}

class DLLNode {
	int data;
	DLLNode prev;
	DLLNode next;
	
	public DLLNode(int data) {
		this.data = data;
		this.prev = this.next = null;
	}
}
