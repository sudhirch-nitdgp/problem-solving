package org.geeks.tree;

import java.util.Stack;

public class TreeTraversalInSpiralForm_1 {

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
		
		spiralTraversal(node1);

	}

	private static void spiralTraversal(TNode root) {
		
		Stack<TNode> s1 = new Stack<TNode>();
		Stack<TNode> s2 = new Stack<TNode>();
		
		s1.add(root);
		
		while(!s1.isEmpty() || !s2.isEmpty()) {
			
			while(!s1.isEmpty()) {
				TNode node = s1.pop();
				System.out.println(node.getData());
				if(node.getLeft() != null) s2.push(node.getLeft());
				if(node.getRight() != null) s2.push(node.getRight());
			}
			
			while(!s2.isEmpty()) {
				TNode node = s2.pop();
				System.out.println(node.getData());
				if(node.getRight() != null) s1.push(node.getRight());
				if(node.getLeft() != null) s1.push(node.getLeft());
			}
		}
	}

}
