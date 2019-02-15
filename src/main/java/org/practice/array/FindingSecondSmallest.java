package org.practice.array;

public class FindingSecondSmallest {

	public static void main(String[] args) {
		
		int a[] = {75,80,90,1,60,10,5,50,21,15,3};
		
		System.out.println(findSecondSmallest(a));

	}
	
	public static int findSecondSmallest(int a[]) {
		int min = a[0];
		int secondMin = 0;
		for(int i=1; i<a.length; i++) {
			if(a[i] < min) {
				secondMin = min;
				min = a[i];
			} else if(a[i] < secondMin) {
				secondMin = a[i];
			}
		}
		return secondMin;
	}

}
