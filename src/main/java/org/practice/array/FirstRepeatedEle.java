package org.practice.array;

import java.util.HashMap;

public class FirstRepeatedEle {

	public static void main(String[] args) {
		int a[] = {3,2,1,2,2,1,3};
		System.out.println(firstRepeatedEle(a));
	}
	
	public static int firstRepeatedEle(int a[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int min = -1;
		for(int i=a.length-1; i>=0; i--) {
			if(map.containsKey(a[i])) {
				min = i;
			} else {
				map.put(a[i], 1);
			}
		}
		return a[min];
	}
}
