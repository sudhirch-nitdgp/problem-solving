package org.practice.bt;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderInReverse {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		levelOrderInReverse(root);

	}
	
	public static void levelOrderInReverse(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
		
		queue.offer(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			stack.push(tmp);
			if(tmp.getRight() != null) {
				queue.offer(tmp.getRight());
			}
			if(tmp.getLeft() != null) {
				queue.offer(tmp.getLeft());
			}
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().getData());
		}
	}

}
