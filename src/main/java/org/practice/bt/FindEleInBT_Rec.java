package org.practice.bt;

public class FindEleInBT_Rec {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(findEle(root, 1));

	}
	
	public static boolean findEle(BinaryTreeNode root, int ele) {
		if(root != null) {
			if(root.getData() == ele) {
				return true;
			} else {
				if(findEle(root.getLeft(), ele) || 
						findEle(root.getRight(), ele)) {
					return true;
				}
			}
		}
		return false;
	}

}
