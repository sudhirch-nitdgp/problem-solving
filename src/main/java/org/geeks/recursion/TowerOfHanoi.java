package org.geeks.recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(3, 'A', 'C', 'B');
	}
	
	public static void towerOfHanoi(int n, char from, char to, char aux) {
		if(n == 1) {
			System.out.println("Move 1 from " + from + " to " + to);
			return;
		}
		towerOfHanoi(n-1, from, aux, to);
		System.out.println("Move " + n + " From " + from + " to " + to);
		towerOfHanoi(n-1, aux, to, from);
	}

}
