package org.geeks.binarysearchtree;

import org.geeks.tree.TNode;

public class FixBSTWithTwoNodesSwapped {
	
	static TNode prev = null;
	static TNode first = null;
	static TNode second = null;

	public static void main(String[] args) {
		
		TNode node1 = new TNode(50);
		TNode node2 = new TNode(60);
		TNode node3 = new TNode(70);
		TNode node4 = new TNode(20);
		TNode node5 = new TNode(40);
		TNode node6 = new TNode(30);
		TNode node7 = new TNode(80);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		fixBST(node1);
		
		swap(first, second);
		
		traverse(node1);
		
	}
	
	public static void fixBST(TNode root) {
		
		if(root == null) return;
		fixBST(root.left);
		
		if(prev != null && prev.data > root.data) {
			if(first == null) {
				first = prev;
			}
			second = root;
		}
		prev = root;
		
		fixBST(root.right);
	}
	
	public static void swap(TNode first, TNode second) {
		int tmp = first.data;
		first.data = second.data;
		second.data = tmp;
	}
	
	public static void traverse(TNode root) {
		if(root != null) {
			traverse(root.left);
			System.out.print(root.data + " ");
			traverse(root.right);
		}
	}

}
