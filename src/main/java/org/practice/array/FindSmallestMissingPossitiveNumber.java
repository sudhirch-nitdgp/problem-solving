package org.practice.array;

import java.util.HashMap;

public class FindSmallestMissingPossitiveNumber {

	public static void main(String[] args) {
		
		int a[] = {2,3,-7,6,8,1,-10,15};
		System.out.println(findMissingNumber(a));
	}
	
	public static int findMissingNumber(int a[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++) {
			if(a[i] > 0) {
				map.put(a[i], a[i]);
			}
		}
		
		for(int i=1; i<=a.length; i++) {
			if(!map.containsKey(i)) {
				return i;
			}
		}
		return -1;
	}

}
