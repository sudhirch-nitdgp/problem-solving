package org.practice.trees.bt;

public class WidthOfBT_Rec {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		int height = height(root);
		
		int maxWidth = 0;
		
		for(int i=1; i<=height; i++) {
			int width = widthOfBT(root, i);
			if(width > maxWidth) {
				maxWidth = width;
			}
		}
		System.out.println(maxWidth);
	}
	
	public static int widthOfBT(BinaryTreeNode root, int level) {
		if(root == null) return 0;
		if(level == 1) return 1;
		return widthOfBT(root.getLeft(), level-1) + widthOfBT(root.getRight(), level-1);
	}
	
	public static int height(BinaryTreeNode root) {
		if(root == null) return 0;
		return Math.max(height(root.getLeft()), height(root.getRight())) + 1;
	}

}
