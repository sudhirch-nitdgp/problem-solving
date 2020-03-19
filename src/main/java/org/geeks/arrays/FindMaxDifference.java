package org.geeks.arrays;

public class FindMaxDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,10,6,4,8,1};
		findMaxDiff(arr);
	}
	
	public static void findMaxDiff(int arr[]) {
		int maxPos = findMaxPos(arr);
		int minPos = findMinPos(arr, maxPos);
		System.out.println(arr[maxPos] - arr[minPos]);
	}
	
	private static int findMinPos(int[] arr, int maxPos) {
		int min = arr[0];
		int minPos = 0;
		for(int i=1; i<maxPos; i++) {
			if(arr[i] < min) {
				min = arr[i];
				minPos = i;
			}
		}
		return minPos;
	}

	public static int findMaxPos(int arr[]) {
		int max = arr[0];
		int maxPos = 0;
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				maxPos = i;
			}
		}
		return maxPos;
	}

}
