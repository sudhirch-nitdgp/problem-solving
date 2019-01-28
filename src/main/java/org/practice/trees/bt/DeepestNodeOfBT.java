package org.practice.trees.bt;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestNodeOfBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(deepestNode(root).getData());

	}
	
	public static BinaryTreeNode deepestNode(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		BinaryTreeNode tmp = null;
		while(!queue.isEmpty()) {
			tmp = queue.poll();
			if(tmp.getLeft() != null) {
				queue.offer(tmp.getLeft());
			}
			if(tmp.getRight() != null) {
				queue.offer(tmp.getRight());
			}
		}
		return tmp;
	}

}
