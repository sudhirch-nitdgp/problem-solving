package org.practice.bt;

import java.util.LinkedList;
import java.util.Queue;

public class SizeOfBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		System.out.println(sizeOfBT(root));

	}
	
	public static int sizeOfBT(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		int size = 0;
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			if(tmp.getLeft() != null) {
				queue.offer(tmp.getLeft());
			}
			if(tmp.getRight() != null) {
				queue.offer(tmp.getRight());
			}
			size++;
		}
		return size;
	}

}
