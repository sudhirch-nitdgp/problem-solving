package org.geeks.tree;

public class CountNodesInCompleteBT {

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
		TNode node10 = new TNode(100);
		TNode node11 = new TNode(100);
		TNode node12 = new TNode(120);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		node4.setLeft(node8);
		node4.setRight(node9);
		node5.setLeft(node10);
		node5.setRight(node11);
		node6.setLeft(node12);
		
		System.out.println(countNodes(node1));

	}
	
	public static int countNodes(TNode root) {
		if(root == null) return 0;
		int lh = 0; int rh = 0;
		TNode curr = root;
		while(curr != null) {
			lh++;
			curr = curr.getLeft();
		}
		curr = root;
		while(curr != null) {
			rh++;
			curr = curr.getRight();
		}
		
		if(lh == rh) {
			return (int) (Math.pow(2, lh)-1);
		} else {
			return 1+countNodes(root.getLeft()) + countNodes(root.getRight());
		}
	}

}
