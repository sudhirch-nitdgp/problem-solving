package org.geeks.arrays;

public class LeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {7,10,4,3,6,5,2};
		findLeaders(arr);
	}
	
	public static void findLeaders(int arr[]) {
		int n = arr.length;
		
		int leader = arr[n-1];
		System.out.println(leader);
		
		for(int i=n-2; i>=0; i--) {
			if(arr[i] > leader) {
				leader = arr[i];
				System.out.println(leader);
			}
		}
	}

}
