package org.geeks.queue;

import java.util.Deque;
import java.util.LinkedList;

public class MaximumOfAllSubArraysOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,8,5,12,15,7,6};
		findMax(a, 3);

	}
	
	public static void findMax(int a[], int k) {
		
		int n = a.length;
		
		Deque<Integer> deQueue = new LinkedList<Integer>();
		
		for(int i=0; i<k; i++) {
			while(!deQueue.isEmpty() && a[deQueue.getLast()] < a[i]) {
				deQueue.removeLast();
			}
			deQueue.add(i);
		}
		
		for(int i=k; i<n; i++) {
			System.out.println(a[deQueue.peek()]);
			
			while(!deQueue.isEmpty() && deQueue.peek() <= i-k) {
				deQueue.removeFirst();
			}
			while(!deQueue.isEmpty() && a[deQueue.getLast()] < a[i]) {
				deQueue.removeLast();
			}
			deQueue.add(i);
		}
		System.out.println(a[deQueue.peek()]);
	}

}
