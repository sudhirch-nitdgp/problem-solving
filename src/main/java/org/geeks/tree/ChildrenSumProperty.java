package org.geeks.tree;

public class ChildrenSumProperty {

	public static void main(String[] args) {
		
		TNode node1 = new TNode(20);
		TNode node2 = new TNode(8);
		TNode node3 = new TNode(12);
		TNode node4 = new TNode(3);
		TNode node5 = new TNode(5);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);

	}
	
	public static boolean isChildSum(TNode root) {
		if(root == null) return true;
		if(root.getLeft() == null && root.getRight() == null) {
			return true;
		}
		int sum = 0;
		if(root.getLeft() != null) sum += root.getLeft().getData();
		if(root.getRight() != null) sum += root.getRight().getData();
		
		return (root.getData() == sum && 
				isChildSum(root.getLeft()) &&
				isChildSum(root.getRight()));
	}

}
