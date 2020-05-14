package org.geeks.tree;

public class DiameterOfBT {
	
	private static int diameter = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		System.out.println("Height of the Tree " + diameterOfBT(node1));
		
		System.out.println("Diameter of the tree " + diameter);

	}
	
	public static int diameterOfBT(TNode root) {
		if(root == null) return 0;
		
		int lh = diameterOfBT(root.getLeft());
		int rh = diameterOfBT(root.getRight());
		
		diameter = Math.max(diameter, lh+rh+1);
		return 1 + Math.max(lh, rh);
	}

}
