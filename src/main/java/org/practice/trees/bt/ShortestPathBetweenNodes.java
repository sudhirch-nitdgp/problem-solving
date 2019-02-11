package org.practice.trees.bt;

public class ShortestPathBetweenNodes {

	public static void main(String[] args) {

		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		findShortestPath(root, 2, 3);

	}

	public static BinaryTreeNode findShortestPath(BinaryTreeNode root, int node1, int node2) {
		if (root == null)
			return null;

		if (root.getData() == node1 || root.getData() == node2) {
			System.out.println(root.getData());
			return root;
		}

		BinaryTreeNode leftNode = findShortestPath(root.getLeft(), node1, node2);
		BinaryTreeNode rightNode = findShortestPath(root.getRight(), node1, node2);

		if (leftNode != null && rightNode != null) {
			System.out.println(root.getData());
			return root;
		} else {
			if (leftNode != null) {
				System.out.println(leftNode.getData());
				return leftNode;
			} if(rightNode != null) {
				System.out.println(rightNode.getData());
				return rightNode;
			}
		}
		return root;
	}

}
