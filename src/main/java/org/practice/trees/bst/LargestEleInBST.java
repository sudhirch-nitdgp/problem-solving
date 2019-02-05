package org.practice.trees.bst;

public class LargestEleInBST {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		
		System.out.println(findLargestEle(root).getData());

	}
	
	public static BinarySearchTreeNode findLargestEle(BinarySearchTreeNode root) {
		while(root != null && root.getRight() != null) {
			root = root.getRight();
		}
		return root;
	}

}
