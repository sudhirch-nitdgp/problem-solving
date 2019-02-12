package org.practice.array;

import java.util.Hashtable;

public class CheckDuplicates_Hash {

	public static void main(String[] args) {
		
		int a[] = {3,2,1,2,2,3};
		
		checkDuplicates(a);

	}
	
	public static void checkDuplicates(int a[]) {
		
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(table.containsKey(a[i])) {
				table.put(a[i], table.get(a[i]) + 1);
				System.out.println("Duplicate elements found");
				return;
			} else {
				table.put(a[i], 1);
			}
		}
		
		System.out.println("Duplicate eles not found");
	}

}
