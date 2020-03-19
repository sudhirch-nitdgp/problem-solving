package org.geeks.arrays;

public class WhoHasMajority {

	public static void main(String[] args) {
		
		//int a[] = {1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 5};
		int a[] = {1, 2,3,4,5};
		System.out.println(findMajority(a, 2, 5));

	}
	
	public static int findMajority(int a[], int x, int y) {
		int x_count = 0;
		int y_count = 0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == x) {
				x_count++;
			} else if(a[i] == y) {
				y_count++;
			}
		}
		
		if(x_count == y_count) {
			return x < y ? x : y;
		}
		return x_count > y_count ? x : y;
		
	}

}
