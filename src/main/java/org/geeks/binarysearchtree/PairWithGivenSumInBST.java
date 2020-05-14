package org.geeks.binarysearchtree;

import java.util.HashSet;

import org.geeks.tree.TNode;

public class PairWithGivenSumInBST {

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
		
		boolean isExist = isPairExist(node1, 80, new HashSet<Integer>());
		
		System.out.println(isExist);

	}
	
	public static boolean isPairExist(TNode root, int sum, HashSet<Integer> set) {
		
		if(root == null) return false;
		
		if(isPairExist(root.left, sum, set) == true) return true;
		
		if(set.contains(sum-root.data)) {
			return true;
		} else {
			set.add(root.data);
		}
		
		return isPairExist(root.right, sum, set);
	}

}
