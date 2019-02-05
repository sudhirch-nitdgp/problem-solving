package org.practice.trees.bst;

public class SmallestEleInBST_Rec {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		System.out.println(findSmallest(root).getData());
	}
	
	public static BinarySearchTreeNode findSmallest(BinarySearchTreeNode root) {
		if(root == null) return null;
		if(root.getLeft() == null) return root;
		return findSmallest(root.getLeft());
	}

}
