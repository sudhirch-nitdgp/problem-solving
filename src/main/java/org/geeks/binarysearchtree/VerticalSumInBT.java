package org.geeks.binarysearchtree;

import java.util.Map.Entry;
import java.util.TreeMap;

import org.geeks.tree.TNode;

public class VerticalSumInBT {

	public static void main(String[] args) {
		
		TNode node1 = new TNode(50);
		TNode node2 = new TNode(30);
		TNode node3 = new TNode(70);
		TNode node4 = new TNode(20);
		TNode node5 = new TNode(40);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(90);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		verticalSum(node1);

	}
	
	public static void verticalSum(TNode root) {
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		verticalSum(root, 0, map);
		
		for(Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.print(map.get(entry.getKey()) + " ");
		}
	}
	
	public static void verticalSum(TNode root, int hd, TreeMap<Integer, Integer> map) {
		if(root == null) return;
		verticalSum(root.left, hd-1, map);
		int sum = (map.get(hd) == null) ? 0 : map.get(hd);
		map.put(hd, sum + root.data);
		verticalSum(root.right, hd+1, map);
	}

}
