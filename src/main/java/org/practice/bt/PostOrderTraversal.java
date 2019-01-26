package org.practice.bt;

public class PostOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		postOrderTraversal(root);

	}
	
	public static void postOrderTraversal(BinaryTreeNode root) {
		if (root == null) return;
		postOrderTraversal(root.getLeft());
		postOrderTraversal(root.getRight());
		System.out.println(root.getData());
	}

}
