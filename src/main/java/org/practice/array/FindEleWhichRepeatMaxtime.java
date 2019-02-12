package org.practice.array;

import java.util.Hashtable;

public class FindEleWhichRepeatMaxtime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,2,1,2,4,3,2};
		
		System.out.println(maxRepeatEle(a));

	}
	
	public static int maxRepeatEle(int a[]) {
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		int max = 0;
		int maxRepeatEle = 0;
		for(int i=0; i<a.length; i++) {
			if(table.containsKey(a[i])) {
				int count = table.get(a[i]) + 1;
				table.put(a[i], count);
				if(count > max) {
					max = count;
					maxRepeatEle = a[i];
				}
			} else {
				table.put(a[i], 1);
			}
		}
		return maxRepeatEle;
	}

}
