package org.geeks.stack;

public class CelebrityProblem {
	
	private int arr[][] = {
			{0, 1, 0},
			{0, 0, 0},
			{0, 1, 0}
	};

	public static void main(String[] args) {
		
		CelebrityProblem celebrity = new CelebrityProblem();
		int celebId = celebrity.findCelebrity();
		System.out.println(celebId);
		
	}
	
	public int findCelebrity() {
		int n = arr.length;
		int a = 0;
		int b = n-1;
		
		while(a < b) {
			if(knows(a,b)) {
				a++;
			} else {
				b--;
			}
		}
		
		for(int i=0; i<n; i++) {
			if(i != a && (knows(a,i) || !knows(i,a))) {
				return -1;
			}
		}
		return a;
	}
	
	public boolean knows(int a, int b) {
		return arr[a][b] == 1 ? true : false;
	}

}
