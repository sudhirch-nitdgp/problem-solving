package org.practice.array;

import java.util.HashMap;

public class OccuringOddNoOfTimes_Hash {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,3,1,3};
		
		System.out.println(oddNoofTimes(a));

	}
	
	public static int oddNoofTimes(int a[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		for(Integer i : map.keySet()) {
			if(map.get(i) % 2 != 0) {
				return i;
			}
		}
		return -1;
	}

}
