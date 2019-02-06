package org.practice.trees.bst;

public class FindLCA {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		
		System.out.println(findLCA(root, 5, 7).getData());

	}
	
	public static BinarySearchTreeNode findLCA(BinarySearchTreeNode root, int ele1, int ele2) {
		if((ele1 < root.getData() || ele2 < root.getData()) && 
				(ele1 > root.getData() || ele2 > root.getData())) {
			return root;
		} else if(ele1 < root.getData() && ele2 < root.getData()) {
			return findLCA(root.getLeft(), ele1, ele2);
		} else {
			return findLCA(root.getRight(), ele1, ele2);
		}
	}

}
