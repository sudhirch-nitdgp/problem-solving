package org.practice.trees.bt;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		levelOrderTraversal(root);

	}
	
	public static void levelOrderTraversal(BinaryTreeNode root) {
		
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			System.out.println(tmp.getData());
			if(tmp.getLeft() != null) {
				queue.offer(tmp.getLeft());
			}
			if(tmp.getRight() != null) {
				queue.offer(tmp.getRight());
			}
		}
		
	}

}
