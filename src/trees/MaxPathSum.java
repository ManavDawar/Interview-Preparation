package trees;

import java.util.*;

public class MaxPathSum {

	// TreeNode class for a node of a Binary Search Tree
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	// This is a functional problem. You have to complete this function.
	// It takes as input the root node of a binary tree. It should return
	// the maximum path sum.
	static int max ;

	public static int maxPathSum(TreeNode node) {
		// write your code here.
		max=Integer.MIN_VALUE;
		int r=maxPathSumHelper1(node);
		return max;
		
	}

	private static int maxPathSumHelper1(TreeNode node) {
		if(node ==null)
			return 0;
		
		int ls= maxPathSumHelper1(node.left);
		int rs=maxPathSumHelper1(node.right);
		
		int rv=Math.max(node.val, Math.max(ls, rs)+node.val);
		
		max=Math.max(max, Math.max(rv, ls+rs+node.val));
		
		return rv;
		
	}

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().trim();

		Integer[] treeArr = inputSplitSpace(input);
		TreeNode root = createTree(treeArr);

		System.out.println(maxPathSum(root));
	}

	// utility function to display a binary tree.
	public static void display(TreeNode node) {
		if (node == null) {
			return;
		}

		String str = "";

		str += node.left == null ? "." : node.left.val;
		str += " <= " + node.val + " => ";
		str += node.right == null ? "." : node.right.val;

		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	// utility function, don't change its code
	public static Integer[] inputSplitSpace(String str) {
		String[] sArr = str.split(" ");
		Integer[] arr = new Integer[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
		}
		return arr;
	}

	// utility function to create a tree, don't change its code.
	public static TreeNode createTree(Integer[] arr) {
		ArrayDeque<TreeNode> que = new ArrayDeque<>();
		TreeNode root = new TreeNode(arr[0]);
		que.addLast(root);
		int i = 1;
		while (!que.isEmpty() && i < arr.length) {
			TreeNode nn = que.removeFirst();

			if (i < arr.length && arr[i] != null) {
				TreeNode n = new TreeNode(arr[i]);
				nn.left = n;
				que.addLast(n);
			}
			i++;

			if (i < arr.length && arr[i] != null) {
				TreeNode n = new TreeNode(arr[i]);
				nn.right = n;
				que.addLast(n);
			}
			i++;
		}

		return root;
	}

}
