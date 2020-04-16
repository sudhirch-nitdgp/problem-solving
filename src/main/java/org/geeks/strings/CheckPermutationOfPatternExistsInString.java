package org.geeks.strings;

public class CheckPermutationOfPatternExistsInString {

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
		String pattern = "egek";
		
		System.out.println(isPatternExist(str, pattern));

	}
	
	public static boolean isPatternExist(String str, String pattern) {
		int count[] = new int[256];
		int pat_count[] = new int[256];
		int pat_length = pattern.length();
		
		for(int i=0; i<pat_length; i++) {
			pat_count[pattern.charAt(i)]++;
			count[str.charAt(i)]++;
		}
		
		for(int i=pat_length; i<str.length(); i++) {
			if(areSame(pat_count, count)) {
				return true;
			}
			
			count[str.charAt(i)]++;
			count[str.charAt(i-pat_length)]--;
		}
		
		return false;
	}

	private static boolean areSame(int[] pat_count, int[] count) {
		for(int i=0; i<pat_count.length; i++) {
			if(pat_count[i] != count[i]) {
				return false;
			}
		}
		return true;
	}

}
