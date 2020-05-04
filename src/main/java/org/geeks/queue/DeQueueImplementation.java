package org.geeks.queue;

public class DeQueueImplementation {
	
	DLLNode front = null;
	DLLNode rear = null;
	
	public static void main(String[] args) {
		
		DeQueueImplementation dequeue = new DeQueueImplementation();
		
		dequeue.insertFront(10);
		dequeue.insertFront(15);
		dequeue.insertFront(20);
		dequeue.insertRear(30);
		dequeue.insertRear(35);
		dequeue.insertRear(40);
		
		dequeue.deleteRear();
		dequeue.deleteRear();
		dequeue.deleteFront();
		
		System.out.println(dequeue.getFront());
		System.out.println(dequeue.getRear());

	}
	
	public void insertFront(int ele) {
		DLLNode tmp = new DLLNode(ele);
		if(front == null) {
			front = tmp;
			rear = tmp;
		} else {
			tmp.next = front;
			front.prev = tmp;
			front = tmp;
		}
			
	}
	
	public void deleteFront() {
		if(front == null) {
			System.out.println("DeQueue is Empty");
		} else {
			front = front.next;
			front.prev = null;
		}
	}
	
	public void insertRear(int ele) {
		DLLNode tmp = new DLLNode(ele);
		if(rear == null) {
			front = tmp;
			rear = tmp;
		} else {
			rear.next = tmp;
			tmp.prev = rear;
			rear = tmp;
		}
	}
	
	public void deleteRear() {
		if(rear == null) {
			System.out.println("DeQueue is Empty");
		} else {
			rear = rear.prev;
			rear.next = null;
		}
	}
	
	public int getFront() {
		return front.data;
	}
	
	public int getRear() {
		return rear.data;
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
