package org.geeks.recursion;

public class IsLuckyNumber {
	
	static int counter = 2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLucky(11));
	}
	
	public static boolean isLucky(int num) {
		
		int num_next_postion = num;
		if(num < counter) {
			return true;
		}
		if(num % counter == 0) {
			return false;
		}
		
		num_next_postion = num_next_postion - num_next_postion/counter;
		
		counter++;
		
		return isLucky(num_next_postion);
		
	}

}
