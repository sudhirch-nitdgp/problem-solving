package org.geeks.tree;

public class LCAOfBT {

	public static void main(String[] args) {
		
		TNode node1 = new TNode(10);
		TNode node2 = new TNode(20);
		TNode node3 = new TNode(30);
		TNode node4 = new TNode(40);
		TNode node5 = new TNode(50);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(70);
		TNode node8 = new TNode(80);
		TNode node9 = new TNode(90);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		node5.setLeft(node8);
		node8.setLeft(node9);
		
		System.out.println(lca(node1, 40, 90).getData());

	}
	
	public static TNode lca(TNode root, int a, int b) {
		if(root == null) return null;
		if(root.getData() == a || root.getData() == b) {
			return root;
		}
		TNode lca1 = lca(root.getLeft(), a, b);
		TNode lca2 = lca(root.getRight(), a, b);
		
		if(lca1 != null && lca2 != null) {
			return root;
		}
		
		if(lca1 != null) {
			return lca1;
		} else {
			return lca2;
		}
	}
	
	

}
