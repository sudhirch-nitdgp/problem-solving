package org.practice.trees.bst;

public class SmallestEleInBST {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		
		System.out.println(findSmallestEle(root).getData());

	}
	
	public static BinarySearchTreeNode findSmallestEle(BinarySearchTreeNode root) {
		BinarySearchTreeNode tmp = null;
		while(root != null) {
			tmp = root;
			root = root.getLeft();
		}
		return tmp;
	}

}
