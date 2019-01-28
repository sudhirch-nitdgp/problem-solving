package org.practice.bt;

public class SizeOfBT_Rec {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(sizeOfBT(root));

	}
	
	public static int sizeOfBT(BinaryTreeNode root) {
		if(root == null) return 0;
		return sizeOfBT(root.getLeft()) + sizeOfBT(root.getRight()) + 1;
	}

}
