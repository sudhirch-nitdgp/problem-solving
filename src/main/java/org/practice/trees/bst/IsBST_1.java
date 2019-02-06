package org.practice.trees.bst;

public class IsBST_1 {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		
		System.out.println(isBST(root));

	}
	
	public static boolean isBST(BinarySearchTreeNode root) {
		
		if(root == null) return true;
		
		if(root.getLeft() != null && findMax(root.getLeft()).getData() > root.getData()) {
			return false;
		}
		
		if(root.getRight() != null && findMin(root.getRight()).getData() < root.getData()){
			return false;
		}
		
		if(!isBST(root.getLeft()) || !isBST(root.getRight())) {
			return false;
		}
		return true;
	}
	
	public static BinarySearchTreeNode findMax(BinarySearchTreeNode root) {
		if(root.getRight() == null) {
			return root;
		}
		return findMax(root.getRight());
	}
	
	public static BinarySearchTreeNode findMin(BinarySearchTreeNode root) {
		if(root.getLeft() == null) {
			return root;
		}
		return findMin(root.getLeft());
	}

}
