package org.geeks.search;

public class FindTripletInSortedArrayWithGivenSum {

	public static void main(String[] args) {
		
		int a[] = {2,3,4,8,9,20,40};
		findTriplet(a, 32);

	}
	
	public static void findTriplet(int a[], int sum) {
		
		for(int i=0; i<a.length; i++) {
			if(isPair(a, i+1, a.length-1, sum-a[i])) {
				System.out.println("Triplet found");
				return;
			}
		}
		System.out.println("Triplet Not found");
	}
	
	public static boolean isPair(int a[], int start, int end, int sum) {
		int total = 0;
		while(start < end) {
			total = a[start] + a[end];
			if(total == sum) {
				return true;
			} else if(total > sum) {
				end--;
			} else {
				start++;
			}
		}
		return false;
	}

}
