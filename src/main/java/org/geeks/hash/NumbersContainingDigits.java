package org.geeks.hash;

import java.util.HashSet;
import java.util.Set;

public class NumbersContainingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		
		int a[] = {12, 111, 34, 13, 55};
		
		findNumbers(a, set);

	}
	
	public static void findNumbers(int a[], Set<Integer> set) {
		
		for(int i=0; i<a.length; i++) {
			int tmp = a[i];
			boolean isInSet = true;
			while(tmp != 0) {
				int digit = tmp%10;
				tmp = tmp/10;
				if(!set.contains(digit)) {
					isInSet = false;
					break;
				}
			}
			if(isInSet) {
				System.out.println(a[i]);
			}
		}
	}

}
