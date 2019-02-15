package org.practice.array;

public class Seperate1And0 {

	public static void main(String[] args) {
		
		int a[] = {0,0,1,1,1,0,1,0,0,1,1};
		
		seperate1And0(a);

	}
	
	public static void seperate1And0(int a[]) {
		int left = 0;
		int right = a.length-1;
		while(left < right) {
			while(a[left] == 0) {
				left++;
			}
			while(a[right] == 1) {
				right--;
			}
			if(left < right) {
				int tmp = a[left];
				a[left] = a[right];
				a[right] = tmp;
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
