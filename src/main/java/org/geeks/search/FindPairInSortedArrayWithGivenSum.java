package org.geeks.search;

public class FindPairInSortedArrayWithGivenSum {

	public static void main(String[] args) {
		int a[] = {2,5,8,12,30};
		findPair(a, 17);
	}
	
	public static void findPair(int a[], int sum) {
		
		int start = 0;
		int end = a.length-1;
		int total = 0;
		
		while(start < end) {
			total = a[start] + a[end];
			if(total == sum) {
				System.out.println("Pair Exists. Indices are "+ start + " and " + end);
				return;
			} else if(total > sum) {
				end--;
			} else {
				start++;
			}
		}
		System.out.println("Pair doesn't exist");
	}

}
