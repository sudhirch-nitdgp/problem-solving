package org.practice.trees.bst;

public class FindEleInBST {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		
		BinarySearchTreeNode node = findEle(root, 7);
		if(node != null) {
			System.out.println("Ele found " + node.getData());
		} else {
			System.out.println("Ele not found");
		}
	}
	
	public static BinarySearchTreeNode findEle(BinarySearchTreeNode root, int ele) {
		if(root == null) return null;
		while(root != null) {
			if(root.getData() == ele) {
				return root;
			} else if(ele < root.getData()) {
				root = root.getLeft();
			} else {
				root = root.getRight();
			}
		}
		return null;
	}
}
