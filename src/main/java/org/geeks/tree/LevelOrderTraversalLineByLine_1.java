package org.geeks.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversalLineByLine_1 {

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

	private static void levelOrder(TNode root) {
		
		Queue<TNode> queue = new LinkedList<TNode>();
		queue.add(root);
		int height = 0;
		while(!queue.isEmpty()) {
			int size = queue.size();
			height++;
			for(int i=0; i<size; i++) {
				TNode node = queue.poll();
				System.out.print(node.getData() + " ");
				if(node.getLeft() != null) {
					queue.add(node.getLeft());
				}
				if(node.getRight() != null) {
					queue.add(node.getRight());
				}
			}
			System.out.println();
		}
		System.out.println("Height of a tree is : " + height);
		
	}
	
	

}
