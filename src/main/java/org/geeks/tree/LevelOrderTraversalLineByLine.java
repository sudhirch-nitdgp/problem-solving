package org.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine {

	public static void main(String[] args) {
		
		TNode node1 = new TNode(10);
		TNode node2 = new TNode(20);
		TNode node3 = new TNode(30);
		TNode node4 = new TNode(40);
		TNode node5 = new TNode(50);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(70);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		levelOrder(node1);
	}
	
	public static void levelOrder(TNode root) {
		Queue<TNode> queue = new LinkedList<TNode>();
		queue.add(root);
		queue.add(null);
		int height = 1; 
		while(!queue.isEmpty() && queue.size() > 1) {
			TNode node = queue.poll();
			if(node == null) {
				queue.add(null);
				System.out.println();
				height++;
			} else {
				System.out.print(node.getData() + " ");
				if(node.getLeft() != null) {
					queue.add(node.getLeft());
				}
				if(node.getRight() != null) {
					queue.add(node.getRight());
				}
			}
		}
		System.out.println();
		System.out.println("Height of the tree is : " + height);
	}

}
