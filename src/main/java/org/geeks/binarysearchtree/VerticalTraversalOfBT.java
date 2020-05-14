package org.geeks.binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.TreeMap;

import org.geeks.tree.TNode;

public class VerticalTraversalOfBT {

	public static void main(String[] args) {
		
		TNode node1 = new TNode(50);
		TNode node2 = new TNode(30);
		TNode node3 = new TNode(70);
		TNode node4 = new TNode(20);
		TNode node5 = new TNode(40);
		TNode node6 = new TNode(60);
		TNode node7 = new TNode(90);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		node2.setLeft(node4);
		node2.setRight(node5);
		node3.setLeft(node6);
		node3.setRight(node7);
		
		verticalTraversal(node1);

	}
	
	public static void verticalTraversal(TNode root) {
		
		Queue<Pair> queue = new LinkedList<Pair>();
		TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<Integer, ArrayList<Integer>>();
		
		queue.add(new Pair(root, 0));
		while(!queue.isEmpty()) {
			Pair pair = queue.poll();
			TNode curr = pair.node;
			int hd = pair.hd;
			
			if(map.get(hd) != null) {
				map.get(hd).add(curr.data);
			} else {
				ArrayList<Integer> list = new ArrayList<Integer>();
				list.add(curr.data);
				map.put(hd, list);
			}
			
			if(curr.left != null) {
				queue.add(new Pair(curr.left, hd-1));
			}
			if(curr.right != null) {
				queue.add(new Pair(curr.right, hd+1));
			}
		}
		
		for(Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
			ArrayList<Integer> list = entry.getValue();
			for(int i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}

class Pair {
	TNode node;
	int hd;
	public Pair(TNode node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}
