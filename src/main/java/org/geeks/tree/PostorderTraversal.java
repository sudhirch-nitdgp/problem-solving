package org.geeks.tree;

public class PostorderTraversal {

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
		
		postorderTraversal(node1);

	}
	
	public static void postorderTraversal(TNode root) {
		if(root != null) {
			postorderTraversal(root.getLeft());
			postorderTraversal(root.getRight());
			System.out.println(root.getData());
		}
	}

}
