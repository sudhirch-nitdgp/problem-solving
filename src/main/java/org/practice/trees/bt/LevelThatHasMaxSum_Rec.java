package org.practice.trees.bt;

public class LevelThatHasMaxSum_Rec {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		int h = height(root);
		int maxSum = 0;
		int maxLevel = 0;
		for(int i=1; i<=h; i++) {
		    int sum = levelThatHasMaxSum(root, i);
		    if (sum > maxSum) {
		    	maxSum = sum;
		    	maxLevel = i;
		    }
		}
		System.out.println("Max Sum : " + maxSum + " Max level: " + maxLevel);
	}
	
	public static int levelThatHasMaxSum(BinaryTreeNode root, int level) {
		if(root == null) return 0;
		if(level == 1) return root.getData();
		return levelThatHasMaxSum(root.getLeft(), level-1) + levelThatHasMaxSum(root.getRight(), level-1);
	}
	
	public static int height(BinaryTreeNode root) {
		if(root == null) return 0;
		return Math.max(height(root.getLeft()), height(root.getRight())) + 1;
	}

}
