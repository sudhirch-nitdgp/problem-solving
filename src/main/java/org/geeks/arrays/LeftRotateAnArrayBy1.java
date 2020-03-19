package org.geeks.arrays;

public class LeftRotateAnArrayBy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		leftRotate(arr);
	}
	
	public static void leftRotate(int arr[]) {
		int tmp = arr[0];
		for(int i=1; i<arr.length; i++) {
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = tmp;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
