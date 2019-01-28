package org.practice.trees.bt;

public class FindMaxInBT_Rec {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		int max = findMax(root);
		
		System.out.println(max);

	}
	
	public static int findMax(BinaryTreeNode root) {
		int max = 0;
		if (root != null) {
			int maxLeft = findMax(root.getLeft());
			int maxRight = findMax(root.getRight());
			if (maxLeft > maxRight) {
				max = maxLeft;
			} else {
				max = maxRight;
			}
			if(root.getData() > max) {
				max = root.getData();
			}
		}
		return max;
	}

}
