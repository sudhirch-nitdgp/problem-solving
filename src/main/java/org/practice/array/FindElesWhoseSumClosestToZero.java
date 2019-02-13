package org.practice.array;

import java.util.Arrays;

public class FindElesWhoseSumClosestToZero {

	public static void main(String[] args) {
		
		int a[] = {1,60,-10,70,-80,85};
		
		Arrays.sort(a);
		
		elesWhoseSumClosestToZero(a);

	}
	
	public static void elesWhoseSumClosestToZero(int a[]) {
		int i = 0;
		int j = a.length-1;
		int tmp = 0;
		int possitiveSum = 10000000;
		int negetiveSum = -10000000;
		int posele1 = 0;
		int posele2 = 0;
		int negele1 = 0;
		int negele2 = 0;
		while(i < j) {
			tmp = a[i] + a[j];
			if(tmp > 0) {
				if(tmp < possitiveSum) {
					possitiveSum = tmp;
					posele1 = a[i];
					posele2 = a[j];
				}
				j--;
				
			} else {
				if(tmp > negetiveSum) {
					negetiveSum = tmp;
					negele1 = a[i];
					negele2 = a[j];
				}
				i++;
			}
		}
		if(Math.abs(negetiveSum) < possitiveSum) {
			System.out.println("Sum is : " + negetiveSum + " Eles are : " + negele1 + "  " + negele2);
		} else {
			System.out.println("Sum is : " + possitiveSum + " Eles are : " + posele1 + "  " + posele2);
		}
	}

}
