package org.practice.trees.bt;

public class MirrorOfBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		root = mirror(root);
		
		preOrder(root);

	}
	
	public static BinaryTreeNode mirror(BinaryTreeNode node) {
		if (node == null) {
			return null;
		}
		BinaryTreeNode left = mirror(node.getLeft());
		BinaryTreeNode right = mirror(node.getRight());

		node.setLeft(right);
		node.setRight(left);

		return node;

	}
	
	public static void preOrder(BinaryTreeNode root) {
		if(root != null) {
			System.out.println(root.getData());
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

}
