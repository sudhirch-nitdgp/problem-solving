package org.practice.trees.bt;

import java.util.LinkedList;
import java.util.Queue;

public class LevelThatHasMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		System.out.println(levelThatHasMaxSum(root));

	}
	
	public static int levelThatHasMaxSum(BinaryTreeNode root) {
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		queue.offer(null);
		int sum = 0;
		int maxSum = 0;
		int level = 1;
		int maxSumLevel = 0;
		while(!queue.isEmpty()) {
			BinaryTreeNode tmp = queue.poll();
			if(tmp == null) {
				if(sum > maxSum) {
					maxSum = sum;
					maxSumLevel = level;
				}
				if(!queue.isEmpty()) {
					queue.offer(null);
					level++;
				}
				sum = 0;
			} else {
				sum += tmp.getData();
				if(tmp.getLeft() != null) {
					queue.offer(tmp.getLeft());
				}
				if(tmp.getRight() != null) {
					queue.offer(tmp.getRight());
				}
			}
		}
		System.out.println("Max Sum : " + maxSum);
		return maxSumLevel;
	}

}
