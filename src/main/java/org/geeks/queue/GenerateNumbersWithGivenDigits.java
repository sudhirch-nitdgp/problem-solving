package org.geeks.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumbersWithGivenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateNumbers("5", "6", 20);
	}
	
	public static void generateNumbers(String digit1, String digit2, int n) {
		Queue<String> queue = new LinkedList<String>();
		
		queue.add(digit1);
		queue.add(digit2);
		
		for(int i=1; i<=n; i++) {
			String ele = queue.poll();
			System.out.println(ele);
			queue.add(ele+digit1);
			queue.add(ele+digit2);
		}
	}

}
