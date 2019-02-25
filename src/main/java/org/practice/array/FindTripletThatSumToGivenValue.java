package org.practice.array;

import java.util.HashMap;

public class FindTripletThatSumToGivenValue {

	public static void main(String[] args) {
		
		int a[] = {12,3,4,1,6,9};
		
		findTriplet(a, 14);

	}
	
	public static void findTriplet(int a[], int sum) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int currentSum = 0;
		for(int i=0; i < a.length-2; i++) {
			currentSum = sum - a[i];
			for(int j=i+1; j < a.length; j++) {
				if(map.containsKey(currentSum-a[j])) {
					System.out.println(a[i] + " " + a[j] + " " + (currentSum-a[j]));
					return;
				} else {
					map.put(a[j], a[j]);
				}
			}
		}
	}

}
