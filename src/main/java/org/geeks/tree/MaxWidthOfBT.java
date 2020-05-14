package org.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthOfBT {

	public static void main(String[] args) {
		
		TNode node1 = new TNode(10);
		TNode node2 = new TNode(20);
		TNode node3 = new TNode(30);
		TNode node4 = new TNode(40);
		TNode node5 = new TNode(50);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(70);
		TNode node8 = new TNode(5);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		node6.setLeft(node8);
		
		int maxWidth = maxWidth(node1);
		System.out.println("Max Width " + maxWidth);
	}
	
	public static int maxWidth(TNode root) {
		Queue<TNode> queue = new LinkedList<TNode>();
		queue.add(root);
		int maxWidth = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			maxWidth = Math.max(maxWidth, size);
			for(int i=0; i<size; i++) {
				TNode node = queue.poll();
				if(node.getLeft() != null) {
					queue.add(node.getLeft());
				}
				if(node.getRight() != null) {
					queue.add(node.getRight());
				}
			}
		}
		return maxWidth;
	}

}
