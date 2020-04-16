package org.geeks.hash;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,4,13,-3,-10,5};
		
		System.out.println(isSubArrayWithZeroSum(a, 0));
	}
	
	private static boolean isSubArrayWithZeroSum(int a[], int sum) {
		int prevSum = 0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length; i++) {
			prevSum += a[i];
			if(prevSum == sum) {
				return true;
			}
			if(set.contains(prevSum-sum)) {
				return true;
			}
			set.add(prevSum);
		}
		return false;
	}

}
