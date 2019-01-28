package org.practice.trees.bt;

import java.util.LinkedList;
import java.util.Queue;

public class FindMaxInBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		System.out.println(findMax(root));

	}
	
	public static int findMax(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		int max = -1;
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			if(tmp.getData() > max) {
				max = tmp.getData();
			}
			if(tmp.getLeft() != null) {
				queue.offer(tmp.getLeft());
			}
			if(tmp.getRight() != null) {
				queue.offer(tmp.getRight());
			}
		}
		return max;
	}

}
