package org.geeks.binarysearchtree;

import org.geeks.tree.TNode;

public class CheckIsBST_1 {
	
	private static int prev = Integer.MIN_VALUE;

	public static void main(String[] args) {
		
		TNode node1 = new TNode(50);
		TNode node2 = new TNode(30);
		TNode node3 = new TNode(70);
		TNode node4 = new TNode(20);
		TNode node5 = new TNode(40);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(80);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		System.out.println(isBST(node1));

	}
	
	public static boolean isBST(TNode root) {
		if(root == null) return true;
		
		if(isBST(root.left) == false) return false;
		
		if(root.data < prev) return false;
		prev = root.data;
		
		return isBST(root.right);
		
	}

}
