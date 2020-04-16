package org.geeks.hash;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,8,6,13,3,-1};
		System.out.println(findSubArray(a, 22));
	}
	
	public static boolean findSubArray(int a[], int sum) {
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
