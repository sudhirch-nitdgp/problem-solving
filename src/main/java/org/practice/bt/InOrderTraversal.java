package org.practice.bt;

import java.util.Stack;

public class InOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		inOrderTraversal(root);

	}
	
	public static void inOrderTraversal(BinaryTreeNode root) {
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		BinaryTreeNode currentNode = root;
		
		while(true) {
			if(currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				if(stack.isEmpty()) break;
				else {
					currentNode = stack.pop();
					System.out.println(currentNode.getData());
					currentNode = currentNode.getRight();
				}
			}
		}
	}

}
