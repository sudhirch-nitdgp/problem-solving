package org.practice.trees.bt;

public class PrintAllAncestorsOfNode {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		ancestors(root, 5);

	}
	
	public static boolean ancestors(BinaryTreeNode root, int ele) {
		if(root == null) {
			return false;
		}
		if(root.getData() == ele) {
			return true;
		} 
		if(ancestors(root.getLeft(), ele) || ancestors(root.getRight(), ele)) {
			System.out.println(root.getData());
			return true;
		}
		return false;
	}

}
