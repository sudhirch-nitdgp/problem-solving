package org.practice.array;

public class FindTheOccurancesOfNumber {

	public static void main(String[] args) {
		
		int a[] = {1,2,2,3,4,5,5,5,6,7,7,8};
		
		System.out.println(findOccurances(a, 5));
	}
	
	public static int findOccurances(int a[], int ele) {
		int start = 0;
		int end = a.length-1;
		
		int position = findElePos(a, start, end, 5);
		
		int leftCount = 0;
		int rightCount = 0;
		int left = position-1;
		int right = position+1;
		while(start <= left) {
			if(a[left] < ele) {
				break;
			} else {
				leftCount++;
			}
			left--;
		}
		
		while(right <= end) {
			if(a[right] > ele) {
				break;
			} else {
				rightCount++;
			}
			right++;
		}
		
		return leftCount + rightCount + 1;
	}
	
	public static int findElePos(int a[], int start, int end, int ele) {
		
		if(start < end) {
			int mid = (start+end)/2;
			if(a[mid] == ele) {
				return mid;
			} else if(ele < mid) {
				return findElePos(a, start, mid-1, ele);
			} else {
				return findElePos(a, mid+1, end, ele);
			}
		}
		return -1;
	}

}
