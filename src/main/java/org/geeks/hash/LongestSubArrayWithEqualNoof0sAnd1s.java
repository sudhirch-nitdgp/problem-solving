package org.geeks.hash;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithEqualNoof0sAnd1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,0,1,1,1,0,0};
		
		System.out.println(longestSubArray(a, 0));

	}
	
	public static int longestSubArray(int a[], int sum) {
		
		int res = 0;
		int prefix_sum = 0;
		int tmp = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == 0) {
				tmp = -1;
			} else {
				tmp = a[i];
			}
			prefix_sum += tmp;
			
			if(prefix_sum == 0) {
				res = i+1;
			}
			
			if(!map.containsKey(prefix_sum)) {
				map.put(prefix_sum, i);
			}
			
			if(map.containsKey(prefix_sum-sum)) {
				res = Math.max(res, i-map.get(prefix_sum-sum));
			}
		}
		return res;
	}

}
