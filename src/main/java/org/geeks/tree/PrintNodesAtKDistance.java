package org.geeks.tree;

public class PrintNodesAtKDistance {

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
		
		print(node1, 1);

	}
	
	public static void print(TNode root, int k) {
		if(root == null) return;
		if(k == 0) {
			System.out.print(root.getData() + " ");
			return;
		}
		
		print(root.getLeft(), k-1);
		print(root.getRight(), k-1);
	}

}
