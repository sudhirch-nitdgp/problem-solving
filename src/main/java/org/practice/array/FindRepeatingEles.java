package org.practice.array;

import java.util.HashMap;

public class FindRepeatingEles {

	public static void main(String[] args) {
		
		int a[] = {4,2,4,5,2,3,1};
		
		repeatingEles(a);

	}
	
	public static void repeatingEles(int a[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		for(Integer i : map.keySet()) {
			if(map.get(i) > 1) {
				System.out.println(i);
			}
		}
	}

}
