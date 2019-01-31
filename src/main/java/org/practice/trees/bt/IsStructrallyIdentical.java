package org.practice.trees.bt;

public class IsStructrallyIdentical {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		BinaryTreeNode root1 = BinaryTreeUtil.getBinaryTree1();
		
		System.out.println(isIdentical(root,root1));

	}
	
	public static boolean isIdentical(BinaryTreeNode root, BinaryTreeNode root1) {
		if(root == null && root1 == null) {
			return true;
		}
		if(root == null || root1 == null) {
			return false;
		}
		return isIdentical(root.getLeft(), root1.getLeft()) && 
				isIdentical(root.getRight(), root1.getRight());
	}

}
