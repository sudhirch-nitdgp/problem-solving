package org.geeks.hash;

import java.util.HashSet;
import java.util.Set;

public class CheckIf2ArraysAreEqualOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1, 2, 5, 4, 0};
		int b[] = {2, 4, 5, 0, 1};
		
		System.out.println(checkEqualOrNot(a, b));

	}
	
	public static boolean checkEqualOrNot(int a[], int b[]) {
		if(a.length != b.length) {
			return false;
		}
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0; i<a.length; i++) {
			set.add(a[i]);
		}
		
		for(int i=0; i<b.length; i++) {
			if(!set.contains(b[i])) {
				return false;
			}
		}
		
		return true;
	}

}
