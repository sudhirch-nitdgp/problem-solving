package org.practice.trees.bt;

import java.util.LinkedList;
import java.util.Queue;

public class FindEleInBT {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(findEle(root, 3));

	}
	
	public static boolean findEle(BinaryTreeNode root, int ele) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			if(tmp.getData() == ele) return true;
			if(tmp.getLeft() != null) {
				queue.offer(tmp.getLeft());
			}
			if(tmp.getRight() != null) {
				queue.offer(tmp.getRight());
			}
		}
		return false;
	}

}
