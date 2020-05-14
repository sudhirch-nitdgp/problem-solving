package org.geeks.binarysearchtree;

import org.geeks.tree.TNode;

public class DeleteInBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TNode node1 = new TNode(50);
		TNode node2 = new TNode(30);
		TNode node3 = new TNode(70);
		TNode node4 = new TNode(20);
		TNode node5 = new TNode(40);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(80);
		TNode node8 = new TNode(65);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		node6.setRight(node8);
		
		TNode root = delete(node1, 50);
		
		traverse(root);

	}
	
	public static TNode delete(TNode root, int ele) {
		if(root == null) return null;
		if(root.data == ele) {
			if(root.left == null) return root.right;
			else if(root.right == null) return root.left;
			else {
				TNode succ = getSccessor(root);
				root.data = succ.data;
				root.right = delete(root.right, succ.data);
			}
			
		} else if(ele < root.data) {
			root.left = delete(root.left, ele);
		} else {
			root.right = delete(root.right, ele);
		}
		return root;
	}
	
	public static TNode getSccessor(TNode root) {
		TNode curr = root.right;
		while(curr != null && curr.left != null) {
			curr = curr.left;
		}
		return curr;
	}
	
	public static void traverse(TNode root) {
		if(root != null) {
			traverse(root.left);
			System.out.print(root.data + " ");
			traverse(root.right);
		}
	}

}
