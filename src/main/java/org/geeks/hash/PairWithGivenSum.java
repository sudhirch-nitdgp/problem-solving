package org.geeks.hash;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,2,8,15,-8};
		
		System.out.println(pairWithSum(a, 17));

	}
	
	public static boolean pairWithSum(int a[], int sum) {
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<a.length; i++) {
			if(set.contains(sum-a[i])) {
				return true;
			}
			set.add(a[i]);
		}
		return false;
	}

}
