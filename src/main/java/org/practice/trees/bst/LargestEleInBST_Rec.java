package org.practice.trees.bst;

public class LargestEleInBST_Rec {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		System.out.println(findLargestEle(root).getData());
	}
	
	public static BinarySearchTreeNode findLargestEle(BinarySearchTreeNode root) {
		if(root == null) return null;
		if(root.getRight() == null) return root;
		return findLargestEle(root.getRight());
	}

}
