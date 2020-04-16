package org.geeks.hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeSorting {

	public static void main(String[] args) {
		
		int a[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
		
		int b[] = {2,1,8,3};
		
		relativeSort(a, b);

	}
	
	public static void relativeSort(int a[], int b[]) {
		
		StringBuilder sb = new StringBuilder();
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(map.containsKey(a[i])) {
				map.put(a[i], 1+map.get(a[i]));
			} else {
				map.put(a[i], 1);
			}
		}
		
		for(int i=0; i<b.length; i++) {
			if(map.containsKey(b[i])) {
				int freq = map.get(b[i]);
				map.remove(b[i]);
				while(freq != 0) {
					sb.append(b[i] + " ");
					freq--;
				}
			}
		}
		
		List<Integer> list = new ArrayList<Integer>(map.keySet());
		
		Collections.sort(list);
		
		for(Integer i : list) {
			sb.append(i + " ");
		}
		
		System.out.println(sb.toString());
		
	}

}
