package org.geeks.hash;

import java.util.HashMap;
import java.util.Map;

public class SubArraysWithEqual1sAnd0s {

	public static void main(String[] args) {
		
		int a[] = {1,0,0,1,0,1,1};
		
		System.out.println(subArrays(a));
	}
	
	public static int subArrays(int a[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pre_sum = 0;
		int count = 0;
		for(int i=0; i<a.length; i++) {
			int tmp = 0;
			if(a[i] == 0) {
				tmp = -1;
			} else {
				tmp = a[i];
			}
			pre_sum += tmp;
			
			if(pre_sum == 0) {
				count++;
			}
			if(map.containsKey(pre_sum)) {
				count += map.get(pre_sum);
			}
			
			if(!map.containsKey(pre_sum)) {
				map.put(pre_sum, 1);
			} else {
				map.put(pre_sum, 1+map.get(pre_sum));
			}
		}
		
		return count;
		
	}

}
