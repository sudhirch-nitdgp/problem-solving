package org.practice.array;

public class SeperateEvenAndOddNumbers {

	public static void main(String[] args) {
		
		int a[] = {12,34,45,9,8,90,3};
		seperateEvenAndOdd(a);
	}
	
	public static void seperateEvenAndOdd(int a[]) {
		int left = 0;
		int right = a.length-1;
		while(left < right) {
			while(a[left] % 2 == 0) {
				left++;
			}
			while(a[right] % 2 == 1) {
				right --;
			}
			if(left < right) {
				int tmp = a[left];
				a[left] = a[right];
				a[right] = tmp;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] +" ");
		}
	}

}
