package org.geeks.hash;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSubSequence {

	public static void main(String[] args) {
		
		//int a[] = {1,9,3,4,2,20};
		int a[] = {2,3,4,5,9,1};
		System.out.println(longestConsSubSeq(a));

	}
	
	public static int longestConsSubSeq(int a[]) {
		int res = 1;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		
		for(int i=0; i<a.length; i++) {
			if(set.contains(a[i]-1)) {
				continue;
			} else {
				int curr = 1;
				while(set.contains(a[i]+curr)) {
					curr++;
				}
				res = Math.max(res, curr);
			}
		}
		return res;
	}

}
