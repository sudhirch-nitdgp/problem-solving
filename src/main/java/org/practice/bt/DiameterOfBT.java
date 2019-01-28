package org.practice.bt;

public class DiameterOfBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(diameterOfBT(root));

	}
	
	public static int diameterOfBT(BinaryTreeNode root) {
		if(root == null) return 0;
		
		int lheight = height(root.getLeft());
		int rheight = height(root.getRight());
		
		int lDiameter = diameterOfBT(root.getLeft());
		int rDiameter = diameterOfBT(root.getRight());
		
		return Math.max(lheight+rheight+1, Math.max(lDiameter,rDiameter));
	}
	
	public static int height(BinaryTreeNode root) {
		if(root == null) return 0;
		return Math.max(height(root.getLeft()), height(root.getRight())) + 1;
	}

}
