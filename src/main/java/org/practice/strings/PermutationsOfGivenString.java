package org.practice.strings;

public class PermutationsOfGivenString {

	public static void main(String[] args) {
		
		String str = "ABC";
		
		permute(str, 0, str.length()-1);

	}
	
	public static void permute(String str, int l, int r) {
		if(l == r) {
			System.out.println(str);
		} else {
			for(int i=l; i<=r; i++) {
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}

	private static String swap(String str, int low, int high) {
		char arr[] = str.toCharArray();
		char tmp;
		tmp = arr[low];
		arr[low] = arr[high];
		arr[high] = tmp;
		return String.valueOf(arr);
	}

}
