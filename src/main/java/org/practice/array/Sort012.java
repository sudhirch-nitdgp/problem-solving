package org.practice.array;

public class Sort012 {

	public static void main(String[] args) {
		
		int a[] = {0,1,1,0,1,2,1,2,0,0,0,1};
		
		sort012(a);
		
		for(int i=0; i < a.length; i++) {
			System.out.print(a[i]);
			System.out.print(" ");
		}

	}
	
	public static void sort012(int a[]) {
		int low = 0;
		int mid = 0;
		int high = a.length - 1;
		while (mid <= high) {
			switch (a[mid]) {
			case 0: {
				int tmp = a[low];
				a[low] = a[mid];
				a[mid] = tmp;
				low++;
				mid++;
				break;
			}

			case 1: {
				mid++;
				break;
			}

			case 2: {
				int tmp = a[mid];
				a[mid] = a[high];
				a[high] = tmp;
				high--;
				break;
			}
				
			}
		}
	}

}
