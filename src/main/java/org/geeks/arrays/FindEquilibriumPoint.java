package org.geeks.arrays;

public class FindEquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,4,8,-9,20,6};
		equilibriumPoint(arr);

	}
	
	public static void equilibriumPoint(int arr[]) {
		int n = arr.length;
		int prefix[] = new int[arr.length];
		int sufix[] = new int[arr.length];
		
		prefix[0] = arr[0];
		for(int i=1; i<n; i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		sufix[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			sufix[i] = sufix[i+1] + arr[i];
		}
		
		for(int i=1; i<n-1; i++) {
			if(prefix[i-1] == sufix[i+1]) {
				System.out.println("Equilibrium at " + i);
				return;
			} 
		}
		System.out.println("No equilibrium point");
	}

}
