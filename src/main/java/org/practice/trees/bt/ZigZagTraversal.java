package org.practice.trees.bt;

import java.util.Stack;

public class ZigZagTraversal {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		zigZagTraversal(root);

	}
	
	public static void zigZagTraversal(BinaryTreeNode root) {
		
		Stack<BinaryTreeNode> currLevel = new Stack<BinaryTreeNode>();
		
		Stack<BinaryTreeNode> nextLevel = new Stack<BinaryTreeNode>();
		
		currLevel.push(root);
		
		boolean leftToRight = true;
		
		while(!currLevel.isEmpty()) {
			BinaryTreeNode tmp = currLevel.pop();
			
			System.out.println(tmp.getData());
			
			if(leftToRight) {
				if(tmp.getLeft() != null) {
					nextLevel.push(tmp.getLeft());
				}
				if(tmp.getRight() != null) {
					nextLevel.push(tmp.getRight());
				}
			} else {
				if(tmp.getRight() != null) {
					nextLevel.push(tmp.getRight());
				}
				if(tmp.getLeft() != null) {
					nextLevel.push(tmp.getLeft());
				}
			}
			
			if(currLevel.isEmpty()) {
				leftToRight = !leftToRight;
				Stack<BinaryTreeNode> tmp1 = currLevel;
				currLevel = nextLevel;
				nextLevel = tmp1;
			}
		}
		
	}

}
