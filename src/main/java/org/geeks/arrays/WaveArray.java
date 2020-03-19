package org.geeks.arrays;

public class WaveArray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6};
		waveArray(a);

	}
	
	public static void waveArray(int a[]) {
		for(int i=0; i<a.length-1; i+=2) {
			int tmp = a[i];
			a[i] = a[i+1];
			a[i+1] = tmp;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
