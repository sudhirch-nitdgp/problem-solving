package org.practice.trees.bst;

import java.util.Stack;

public class FindKthSmallestEleInBST {

	public static void main(String[] args) {
		
		BinarySearchTreeNode root = BinarySearchTreeUtil.getBinarySearchTree();
		
		findKthSmallest(root, 4);

	}
	
	public static void findKthSmallest(BinarySearchTreeNode root, int k) {
		Stack<BinarySearchTreeNode> stack = new Stack<BinarySearchTreeNode>();
		BinarySearchTreeNode currentNode = root;
		int count = 0;
		while (true) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				currentNode = stack.pop();
				count++;
				if (count == k) {
					System.out.println(currentNode.getData());
					break;
				}
				currentNode = currentNode.getRight();
			}
		}
	}

}
