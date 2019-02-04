package org.practice.trees.bst;

public class FindEleInBST_Rec {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		BinarySearchTreeNode node = findEle(root, 7);
		if(null != node) {
			System.out.println("Ele found " + node.getData());
		} else {
			System.out.println("Ele not found");
		}
	}
	
	public static BinarySearchTreeNode findEle(BinarySearchTreeNode root, int ele) {
		if(root == null) return null;
		if(root.getData() == ele) {
			return root;
		} else if(ele < root.getData()) {
			return findEle(root.getLeft(), ele);
		} else {
			return findEle(root.getRight(), ele);
		}
	}

}
