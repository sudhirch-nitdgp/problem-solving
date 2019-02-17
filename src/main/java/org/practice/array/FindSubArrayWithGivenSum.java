package org.practice.array;

public class FindSubArrayWithGivenSum {

	public static void main(String[] args) {
		
		int a[] = {1, 4, 20, 3, 10, 5};
		
		findArray(a, 33);

	}
	
	public static void findArray(int a[], int sum) {
		
		int start = 0;
		int currSum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			currSum += a[i];
			
			while(currSum > sum) {
				currSum -= a[start];
				start++;
			}
			
			if(currSum == sum) {
				System.out.println("Sum found between : " + start + " and " + i);
				return;
			}
		}
		
		
	}

}
