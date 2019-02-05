package org.practice.trees.bt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class VerticalSumOfBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		Map<Integer, Integer> vertexMap = new HashMap<Integer, Integer>();
		
		vertexMap = verticalSum(root, 0, vertexMap);
		
		Set<Entry<Integer,Integer>> entrySet = vertexMap.entrySet();
		
		Iterator<Entry<Integer, Integer>> it = entrySet.iterator();
		
		while(it.hasNext()) {
			Entry<Integer, Integer> entry = it.next();
			System.out.print(entry.getKey() + "   " + entry.getValue());
			System.out.println();
		}

	}
	
	public static Map<Integer, Integer> verticalSum(BinaryTreeNode root, int vertex, Map<Integer, Integer> map) {
		if(root != null) {
			if(map.containsKey(vertex)) {
				map.put(vertex, map.get(vertex) + root.getData());
			} else {
				map.put(vertex, root.getData());
			}
			verticalSum(root.getLeft(), vertex-1, map);
			verticalSum(root.getRight(), vertex+1, map);
		}
		return map;
	}

}
