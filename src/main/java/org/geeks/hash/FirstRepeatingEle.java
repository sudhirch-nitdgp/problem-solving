package org.geeks.hash;

import java.util.HashSet;

public class FirstRepeatingEle {

	public static void main(String[] args) {
		
		int a[] = {1,5,2,3,4,3,5,6};
		System.out.println(firstRepeatingEle(a));
	}
	
	public static int firstRepeatingEle(int a[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		int ele = -1;
		for(int i=a.length-1; i>=0; i--) {
			
			if(set.contains(a[i])) {
				ele = a[i];
			} else {
				set.add(a[i]);
			}
		}
		return ele;
	}

}
