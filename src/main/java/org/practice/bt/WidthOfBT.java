package org.practice.bt;

import java.util.LinkedList;
import java.util.Queue;

public class WidthOfBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(widthOfBT(root));
		

	}
	
	public static int widthOfBT(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		queue.offer(null);
		int width = 0;
		int maxWidth = 0;
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			if(tmp == null) {
				if(width > maxWidth) {
					maxWidth = width;
				}
				if(!queue.isEmpty()) {
					queue.offer(null);
				}
				width = 0;
			} else {
				width++;
				if(tmp.getLeft() != null) {
					queue.offer(tmp.getLeft());
				}
				if(tmp.getRight() != null) {
					queue.offer(tmp.getRight());
				}
			}
		}
		return maxWidth;
	}

}
