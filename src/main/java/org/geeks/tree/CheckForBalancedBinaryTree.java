package org.geeks.tree;

public class CheckForBalancedBinaryTree {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		int val = isBalanced(node1);
		
		if(val == -1) {
			System.out.println("Not Balanced");
		} else {
			System.out.println("Balanced");
		}

	}
	
	public static int isBalanced(TNode root) {
		if(root == null) return 0;
		int lh = isBalanced(root.getLeft());
		if(lh == -1) return -1;
		int rh = isBalanced(root.getRight());
		if(rh == -1) return -1;
		if(Math.abs(lh-rh) > 1) {
			return -1;
		} else {
			return 1+Math.max(lh, rh);
		}
	}
	
}
