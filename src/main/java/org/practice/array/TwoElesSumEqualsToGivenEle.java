package org.practice.array;

import java.util.HashMap;
import java.util.Map;

public class TwoElesSumEqualsToGivenEle {

	public static void main(String[] args) {
		
		int a[] = {7,15,32,35,25};
		
		twoElesSumEqualsToEle(a, 40);

	}
	
	public static void twoElesSumEqualsToEle(int a[], int ele) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			if(map.containsKey(ele-a[i])) {
				System.out.println("Eles are : " + (ele-a[i]) + "  " + a[i]);
				return;
			} else {
				map.put(a[i], a[i]);
			}
		}
		System.out.println("Eles not found ");
	}

}
