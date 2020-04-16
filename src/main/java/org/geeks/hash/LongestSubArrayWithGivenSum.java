package org.geeks.hash;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int a[] = {8,3,1,5,-6,6,2,2};
		
		System.out.println(longestSubArray(a, 4));

	}
	
	public static int longestSubArray(int a[], int sum) {
		int res = 0;
		int prefixSum = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++) {
			prefixSum += a[i];
			if(prefixSum == sum) {
				res = i+1;
			}
			if(!map.containsKey(prefixSum)) {
				map.put(prefixSum, i);
			}
			if(map.containsKey(prefixSum-sum)) {
				res = Math.max(res, i-map.get(prefixSum-sum));
			}
		}
		
		return res;
	}

}
