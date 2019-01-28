package org.practice.trees.bt;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(heightOfBT(root));

	}
	
	public static int heightOfBT(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		queue.offer(null);
		int height = 1;
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			if(tmp == null) {
				if(!queue.isEmpty()) {
					queue.offer(null);
					height++;
				}
			} else {
				if(tmp.getLeft() != null) {
					queue.offer(tmp.getLeft());
				}
				if(tmp.getRight() != null) {
					queue.offer(tmp.getRight());
				}
			}
		}
		return height;
	}

}
