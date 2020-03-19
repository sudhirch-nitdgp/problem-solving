package org.geeks.arrays;

public class FindMajorityElement {

	public static void main(String[] args) {
		
		int a[] = {8,8,6,6,6,4};
		
		System.out.println(findMajority(a));

	}
	
	public static int findMajority(int a[]) {
		int result = findMajorityCandidateIndex(a);
		int count = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i] == a[result]) {
				count++;
			}
		}
		if(count <= (a.length)/2) {
			return -1;
		}
		return result;
	}
	
	public static int findMajorityCandidateIndex(int a[]) {
		int majority_candidate_index = 0;
		int count = 1;
		
		for(int i=1; i<a.length; i++) {
			if(a[majority_candidate_index] == a[i]) {
				count++;
			} else {
				count--;
			}
			if(count == 0) {
				majority_candidate_index = i;
				count = 1;
			}
		}
		return majority_candidate_index;
	}

}
