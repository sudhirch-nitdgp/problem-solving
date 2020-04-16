package org.geeks.hash;

import java.util.HashMap;
import java.util.Map;

public class CountDistinctElesInEveryWindow {

	public static void main(String[] args) {
		
		int a[] = {10,20,10,10,30,40};
		
		countDistinctEles(a, 4);

	}
	
	public static void countDistinctEles(int a[], int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<k; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], 1+map.get(a[i]));
			} else {
				map.put(a[i], 1);
			}
		}
		sb.append(map.size() + " ");
		
		for(int i=k; i<a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], 1+map.get(a[i]));
			} else {
				map.put(a[i], 1);
			}
			
			if(map.get(a[i-k]) > 1) {
				map.put(a[i-k], map.get(a[i-k]-1));
			} else {
				map.remove(a[i-k]);
			}
			sb.append(map.size() + " ");
		}
		
		System.out.println(sb.toString());
	}

}
