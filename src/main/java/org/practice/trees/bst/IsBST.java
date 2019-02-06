package org.practice.trees.bst;

public class IsBST {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		System.out.println(isBST(root));

	}
	
	public static boolean isBST(BinarySearchTreeNode root) {
		if(root == null) return true;
		if(root.getLeft() != null && root.getLeft().getData() > root.getData()) {
			return false;
		}
		if(root.getRight() != null && root.getRight().getData() < root.getData()) {
			return false;
		}
		if(!isBST(root.getLeft()) || !isBST(root.getRight())) {
			return false;
		}
		return true;
	}

}
