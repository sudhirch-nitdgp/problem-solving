package org.geeks.hash;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubArrays {

	public static void main(String[] args) {
		
		int a[] = {6,-1,-3,4,-2,2,4,6,-12,-7};
		System.out.println(zeroSumSubArrays(a));

	}
	
	public static int zeroSumSubArrays(int a[]) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int pre_sum = 0;
		int count = 0;
		
		for(int i=0; i<a.length; i++) {
			pre_sum += a[i];
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
