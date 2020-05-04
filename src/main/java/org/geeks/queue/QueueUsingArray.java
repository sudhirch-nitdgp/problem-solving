package org.geeks.queue;

public class QueueUsingArray {
	
	int a[];
	int front;
	int rear;
	int size;
	int capacity;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueUsingArray queue = new QueueUsingArray(5);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(15);
		System.out.println(queue.peek());
		System.out.println(queue.getLast());
		queue.deQueue();
		System.out.println(queue.peek());
	}
	
	public QueueUsingArray(int capacity) {
		a = new int[capacity];
		front = 0;
		rear = 0;
		size = 0;
		this.capacity = capacity;
	}
	
	public void enQueue(int ele) {
		if(size == capacity) {
			System.out.println("Queue is full");
		} else {
			if(front == -1) {
				front++;
			}
			rear++;
			a[rear] = ele;
			size++;
		}
	}
	
	public int deQueue() {
		int ele = -1;
		if(size == 0) {
			System.out.println("Queue is empty");
		} else {
			ele = a[front];
			for(int i=0; i<size; i++) {
				a[i] = a[i+1];
			}
			size--;
		}
		return ele;
	}
	
	public int peek() {
		return a[front];
	}
	
	public int getSize() {
		return size;
	}
	
	public int getLast() {
		return a[rear];
	}

}
