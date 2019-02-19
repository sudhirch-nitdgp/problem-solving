package org.practice.array;

public class FindMinMax {

	public static void main(String[] args) {
		
		int a[] = {1000,11,445,1,330,3000};
		findMinMax(a);
	}
	
	public static void findMinMax(int a[]) {
		int min = a[0];
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			} else if(a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("Min : "+ min + " Max : "+ max);
	}

}
