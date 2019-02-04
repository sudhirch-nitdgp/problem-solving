package org.practice.trees.bst;

public class BinarySearchTreeUtil {
	
	public static BinarySearchTreeNode getBinarySearchTree() {
		BinarySearchTreeNode node1 = new BinarySearchTreeNode(6);
		BinarySearchTreeNode node2 = new BinarySearchTreeNode(4);
		BinarySearchTreeNode node3 = new BinarySearchTreeNode(8);
		BinarySearchTreeNode node4 = new BinarySearchTreeNode(2);
		BinarySearchTreeNode node5 = new BinarySearchTreeNode(5);
		BinarySearchTreeNode node6 = new BinarySearchTreeNode(7);
		BinarySearchTreeNode node7 = new BinarySearchTreeNode(9);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		return node1;
	}

}
