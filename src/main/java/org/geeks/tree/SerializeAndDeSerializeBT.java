package org.geeks.tree;

import java.util.ArrayList;
import java.util.List;

public class SerializeAndDeSerializeBT {
	
	public static int index = 0;

	public static void main(String[] args) {
		
		TNode node1 = new TNode(10);
		TNode node2 = new TNode(20);
		TNode node3 = new TNode(30);
		TNode node4 = new TNode(40);
		TNode node5 = new TNode(50);
		
		node1.setLeft(node2);
		node2.setLeft(node3);
		node3.setRight(node4);
		node1.setRight(node5);
		
		List<Integer> list = new ArrayList<Integer>();
		serialize(node1, list);
		
		TNode root = deSerialize(list);
		traverse(root);
		

	}
	
	public static void serialize(TNode root, List<Integer> list) {
		
		if(root == null) {
			list.add(-1);
			return;
		}
		
		list.add(root.getData());
		serialize(root.getLeft(), list);
		serialize(root.getRight(), list);
	}
	
	public static TNode deSerialize(List<Integer> list) {
		
		if(list.size() == index) {
			return null;
		}
		int val = list.get(index);
		index++;
		
		if(val == -1) {
			return null;
		}
		
		TNode root = new TNode(val);
		
		TNode left = deSerialize(list);
		root.setLeft(left);
		TNode right = deSerialize(list);
		root.setRight(right);
		return root;
	}
	
	public static void traverse(TNode root) {
		if(root != null) {
			System.out.println(root.getData());
			traverse(root.getLeft());
			traverse(root.getRight());
		}
	}

}
