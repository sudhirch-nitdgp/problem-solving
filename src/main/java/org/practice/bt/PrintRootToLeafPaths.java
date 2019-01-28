package org.practice.bt;

public class PrintRootToLeafPaths {

	public static void main(String[] args) {
		
		BinaryTreeNode root = BinaryTreeUtil.getBinaryTree();
		
		int path[] = new int[256];
		
		printPaths(root, path, 0);

	}
	
	public static void printPaths(BinaryTreeNode root, int[] path, int pathLen) {
		
		if(root == null) return;
		
		path[pathLen] = root.getData();
		
		if(root.getLeft() == null && root.getRight() == null) {
			printArray(path, pathLen);
		} else {
			printPaths(root.getLeft(), path, pathLen+1);
			printPaths(root.getRight(), path, pathLen+1);
		}
	}
	
	public static void printArray(int[] path, int pathLen) {
		for(int i=0; i <=pathLen; i++) {
			System.out.print(path[i] + "-->");
		}
		System.out.println();
	}

}
