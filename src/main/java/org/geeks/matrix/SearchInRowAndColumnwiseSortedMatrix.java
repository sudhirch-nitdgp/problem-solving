package org.geeks.matrix;

public class SearchInRowAndColumnwiseSortedMatrix {

	public static void main(String[] args) {
		
		int a[][] = {
				{10,20,30,40},
				{15,25,35,45},
				{27,29,37,48},
				{32,33,39,50}
		};
		
		searchEle(a, 29);

	}
	
	public static void searchEle(int a[][], int ele) {
		int r = a.length;
		int c = a[0].length;
		int i = 0;
		int j = c-1;
		if(ele < a[0][0]) {
			System.out.println("not found");
			return;
		}
		if(ele > a[r-1][c-1]) {
			System.out.println("not found");
			return;
		}
		while(i<r && j>=0) {
			if(a[i][j] == ele) {
				System.out.println("("+i + " " + j+")");
				return;
			} else if(ele < a[i][j]) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println("not found");
	}

}
