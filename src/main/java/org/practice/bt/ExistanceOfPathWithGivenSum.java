package org.practice.bt;

public class ExistanceOfPathWithGivenSum {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(isPathGivenSum(root, 10));

	}
	
	public static boolean isPathGivenSum(BinaryTreeNode root, int sum) {
		if(root == null) return false;
		
		if(root.getLeft() == null && root.getRight() == null && root.getData() == sum) return true;
		
		return isPathGivenSum(root.getLeft(), sum-root.getData()) || 
				isPathGivenSum(root.getRight(), sum-root.getData());
	}
}