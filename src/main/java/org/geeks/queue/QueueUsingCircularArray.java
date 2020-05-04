package org.geeks.queue;

public class QueueUsingCircularArray {
	
	private int capacity;
	private int size;
	private int front;
	private int rear;
	private int a[];

	public static void main(String[] args) {
		QueueUsingCircularArray queue = new QueueUsingCircularArray(5);
		
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.enqueue(25);
		queue.enqueue(30);
		queue.dequeue();
		queue.enqueue(35);
		
		System.out.println(queue.getFrontEle());
		System.out.println(queue.getRearEle());
	}
	
	public QueueUsingCircularArray(int capacity) {
		this.capacity = capacity;
		this.size = 0;
		this.front = -1;
		this.rear = -1;
		a = new int[capacity];
	}
	
	public void enqueue(int ele) {
		if(size == capacity) {
			System.out.println("Queue is full");
		} else {
			if(front == -1) {
				front++;
			}
			rear = (rear+1)%capacity;
			a[rear] = ele;
			size++;
		}
	}
	
	public int dequeue() {
		int ele = -1;
		if(size == 0) {
			System.out.println("Queue is empty");
		} else {
			ele = a[front];
			front = (front+1)%capacity;
			size--;
		}
		return ele;
	}
	
	public int getFrontEle() {
		return a[front];
	}
	
	public int getRearEle() {
		return a[rear];
	}

}
