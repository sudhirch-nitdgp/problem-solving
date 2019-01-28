package org.practice.trees.bt;

import java.util.Stack;

public class PreOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		preOrderTraversal(root);

	}
	
	public static void preOrderTraversal(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		
		BinaryTreeNode currentNode = root;
		
		while(true) {
			if(currentNode != null) {
				System.out.println(currentNode.getData());
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				if(stack.isEmpty()) {
					break;
				} else {
					currentNode = stack.pop().getRight();
				}
			}
		}
		
	}

}
