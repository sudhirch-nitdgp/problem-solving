package org.geeks.arrays;

public class MinAdjecentDiffInCircuarArray {

	public static void main(String[] args) {
		
		//int a[] = {8, -8, 9, -9, 10, -11, 12};
		
		int a[] = {-1, 40, -14, 7, 6, 5, -4, -1};
		
		System.out.println(minAdjDiff(a));

	}
	
	public static int minAdjDiff(int a[]) {
		int minDiff = 10000;
		int diff = 0;
		
		for(int i=0; i<a.length-1; i++) {
			diff = Math.abs(a[i] - a[i+1]);
			if(diff < minDiff) {
				minDiff = diff;
			}
		}
		
		diff = Math.abs(a[a.length-1]-a[0]);
		
		return Math.min(diff, minDiff);
	}

}
