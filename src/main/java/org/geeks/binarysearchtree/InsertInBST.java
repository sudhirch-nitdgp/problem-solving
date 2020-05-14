package org.geeks.binarysearchtree;

import org.geeks.tree.TNode;

public class InsertInBST {

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
		
		TNode root = insert(node1, 35);
		root = insert(root, 65);
		traverse(root);

	}
	
	public static TNode insert(TNode root, int ele) {
		if(root == null) {
			return new TNode(ele);
		}
		if(ele < root.data) {
			root.left = insert(root.left, ele);
		} else {
			root.right = insert(root.right, ele);
		}
		return root;
	}
	
	public static void traverse(TNode root) {
		if(root != null) {
			traverse(root.left);
			System.out.print(root.data + " ");
			traverse(root.right);
		}
	}

}
