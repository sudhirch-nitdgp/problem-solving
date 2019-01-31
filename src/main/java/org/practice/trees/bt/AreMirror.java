package org.practice.trees.bt;

public class AreMirror {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		BinaryTreeNode root1 = BinaryTreeUtil.getBinaryTree1();
		
		System.out.println(areMirror(root, root1));

	}
	
	public static boolean areMirror(BinaryTreeNode root, BinaryTreeNode root1) {
		
		if(root == null && root1 == null) {
			return true;
		}
		
		if(root == null || root1 == null) {
			return false;
		}
		
		return root.getData() == root1.getData() && 
				areMirror(root.getLeft(), root1.getRight()) && 
				areMirror(root.getRight(), root1.getLeft());
	}

}
