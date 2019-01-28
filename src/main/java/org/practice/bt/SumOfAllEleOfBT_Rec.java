package org.practice.bt;

public class SumOfAllEleOfBT_Rec {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(sumOfEles(root));
		
	}
	
	public static int sumOfEles(BinaryTreeNode root) {
		if(root == null) return 0;
		
		return root.getData() + sumOfEles(root.getRight()) + sumOfEles(root.getRight());
		
	}

}
