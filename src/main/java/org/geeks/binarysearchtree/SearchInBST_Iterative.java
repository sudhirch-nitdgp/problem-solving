package org.geeks.binarysearchtree;

import org.geeks.tree.TNode;

public class SearchInBST_Iterative {

	public static void main(String[] args) {
		
		TNode node1 = new TNode(50);
		TNode node2 = new TNode(30);
		TNode node3 = new TNode(70);
		TNode node4 = new TNode(20);
		TNode node5 = new TNode(40);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(80);
		TNode node8 = new TNode(65);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		node6.setRight(node8);
		
		boolean isPresent = search(node1, 65);
		
		System.out.println(isPresent);

	}
	
	
	public static boolean search(TNode root, int ele) {
		
		if(root == null) return false;
		
		while(root != null) {
			if(root.data == ele) {
				return true;
			} else if(ele < root.data) {
				root = root.left;
			} else {
				root = root.right;
			}
		}
		return false;
	}

}
