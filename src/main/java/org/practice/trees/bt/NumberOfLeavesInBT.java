package org.practice.trees.bt;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfLeavesInBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(numberOfLeaves(root));

	}
	
	public static int numberOfLeaves(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		int noOfLeaves = 0;
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			if(tmp.getLeft() == null && tmp.getRight() == null) {
				noOfLeaves++;
			}
			if(tmp.getLeft() != null) {
				queue.offer(tmp.getLeft());
			}
			if(tmp.getRight() != null) {
				queue.offer(tmp.getRight());
			}
		}
		return noOfLeaves;
	}

}
