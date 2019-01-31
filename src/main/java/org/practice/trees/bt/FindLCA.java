package org.practice.trees.bt;

public class FindLCA {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(findLCA(root, 4, 5).getData());

	}
	
	public static BinaryTreeNode findLCA(BinaryTreeNode root, int node1, int node2) {
		if(root == null) return null;
		
		if(root.getData() == node1 || root.getData() == node2) {
			return root;
		}
		
		BinaryTreeNode leftNode = findLCA(root.getLeft(), node1, node2);
		BinaryTreeNode rightNode = findLCA(root.getRight(), node1, node2);
		
		if(leftNode != null && rightNode != null) {
			return root;
		} else {
			return leftNode != null ? leftNode : rightNode;
		}
		
	}

}
