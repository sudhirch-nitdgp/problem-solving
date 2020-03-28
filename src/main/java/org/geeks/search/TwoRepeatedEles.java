package org.geeks.search;

public class TwoRepeatedEles {

	public static void main(String[] args) {
		
		int a[] = {1,2,1,3,4,4,3};
		
		find2RepeatedEles(a);

	}
	
	public static void find2RepeatedEles(int a[]) {
		
		for(int i=0; i<a.length; i++) {
			if(a[Math.abs(a[i])] < 0) {
				System.out.println(Math.abs(a[i]));
			}
			a[Math.abs(a[i])] = -a[Math.abs(a[i])];
		}
	}

}
