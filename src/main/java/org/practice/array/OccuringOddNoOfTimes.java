package org.practice.array;

public class OccuringOddNoOfTimes {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,2,3,1,3};
		
		System.out.println(occurOddTimes(a));
		
	}
	
	public static int occurOddTimes(int a[]) {
		int res = 0;
		for(int i=0; i<a.length; i++) {
			res^=a[i];
		}
		return res;
	}

}
