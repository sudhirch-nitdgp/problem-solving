package org.practice.array;

public class CheckPairwiseSortedOrNot {

	public static void main(String[] args) {
		
		int a[] = {5,8,10,13,15,20};
		
		System.out.println(checkPairwiseSorted(a));

	}
	
	public static boolean checkPairwiseSorted(int a[]) {
		for(int i=0; i<a.length; i+=2) {
			if(a[i] > a[i+1]) {
				return false;
			}
		}
		return true;
	}

}
