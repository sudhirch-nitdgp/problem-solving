package org.geeks.search;

public class FindSquareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findSquareRoot(49));
	}
	
	public static int findSquareRoot(int num) {
		int l = 0;
		int h = num;
		int mid = 0;
		int ans = -1;
		while(l <= h) {
			mid = (l+h)/2;
			if(mid * mid == num) {
				return mid;
			} else if(mid*mid > num) {
				h = mid-1;
			} else {
				l = mid+1;
				ans = mid;
			}
		}
		
		return ans;
	}

}
