package org.geeks.binarysearchtree;

import org.geeks.tree.TNode;

public class InsertInBST_Iterative {

	public static void main(String[] args) {
		
		TNode node1 = new TNode(50);
		TNode node2 = new TNode(30);
		TNode node3 = new TNode(70);
		TNode node4 = new TNode(20);
		TNode node5 = new TNode(40);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(80);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		TNode root = insert(node1, 65);
		
		traverse(root);

	}

	private static TNode insert(TNode root, int ele) {
		TNode parent = null;
		TNode curr = root;
		
		if(curr == null) {
			return new TNode(ele);
		}
		while(curr != null) {
			parent = curr;
			if(curr.data == ele) {
				return root;
			} else if(ele < curr.data) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		if(ele < parent.data) {
			parent.left = new TNode(ele);
		} else {
			parent.right = new TNode(ele);
		}
		return root;
	}
	
	public static void traverse(TNode root) {
		if(root != null) {
			traverse(root.left);
			System.out.print(root.data + " ");
			traverse(root.right);
		}
	}

}
