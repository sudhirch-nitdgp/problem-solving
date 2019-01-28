package org.practice.trees.bt;

public class HeightOfBT_Rec {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		System.out.println(heightOfBT(root));

	}
	
	public static int heightOfBT(BinaryTreeNode root) {
		if(root == null) return 0;
		int leftHeight = heightOfBT(root.getLeft());
		int rightHeight = heightOfBT(root.getRight());
		return leftHeight > rightHeight ? leftHeight+1 : rightHeight+1;
	}

}
