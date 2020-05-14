package org.geeks.binarysearchtree;

import java.util.TreeSet;

public class CeilingOnLeftSideInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2, 18, 30, 15, 25, 12};
		
		ceilOnLeftSide(a);

	}
	
	public static void ceilOnLeftSide(int a[]) {
		System.out.print(-1 + " ");
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(a[0]);
		for(int i=1; i<a.length; i++) {
			Integer ceil = set.ceiling(a[i]);
			if(ceil != null && set.contains(ceil)) {
				System.out.print(ceil.intValue() + " ");
			} else {
				System.out.print(-1 + " ");
			}
			set.add(a[i]);
		}
	}

}
