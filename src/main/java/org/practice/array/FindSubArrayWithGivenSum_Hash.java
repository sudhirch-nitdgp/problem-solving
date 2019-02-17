package org.practice.array;

import java.util.HashMap;

public class FindSubArrayWithGivenSum_Hash {

	public static void main(String[] args) {
		
		//int arr[] = {8, 2, -2, -20, 10, 5};
		
		int arr[] = {1, 4, 20, 3, 10, 5};
		
		findSubArray(arr, 33);

	}
	
	public static void findSubArray(int a[], int sum) {
		
		int start = 0;
		int currSum = 0;
		int end = -1;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i<a.length; i++) {
			
			currSum += a[i];
			
			if(currSum == sum) {
				start = 0;
				end = i;
				break;
			}
			
			if(map.containsKey(currSum - sum)) {
				start = map.get(currSum-sum) + 1;
				end = i;
				break;
			} else {
				map.put(currSum, i);
			}
		}
		System.out.println(start + "   " + end);
	}

}
