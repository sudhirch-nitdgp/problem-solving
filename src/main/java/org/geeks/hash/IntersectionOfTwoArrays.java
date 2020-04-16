package org.geeks.hash;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,15,20,15,30,30,5};
		int b[] = {30,5,30,80};
		
		intersection(a, b);
	}
	
	public static void intersection(int a[], int b[]) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		
		for(int i=0; i<b.length; i++) {
			if(set.contains(b[i])) {
				System.out.println(b[i]);
				set.remove(b[i]);
			}
		}
	}

}
