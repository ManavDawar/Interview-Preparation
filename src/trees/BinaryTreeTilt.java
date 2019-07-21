package trees;

import java.io.*;
import java.util.*;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

class BinaryTree {
	static int tilt;

	public int findTilt(TreeNode node) {
		// Write your code here .
		tilt = 0;
		findTiltHelper(node);
		return tilt;
	}

	private int findTiltHelper(TreeNode node) {
		if (node == null)
			return 0;
		int ls = findTiltHelper(node.left);
		int rs = findTiltHelper(node.right);
		int rv = ls + node.val + rs;
		tilt += Math.abs(ls - rs);
		return rv;
	}

}

public class BinaryTreeTilt {

	public static TreeNode construct(Integer[] arr) {
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

	public static Integer[] inputSplitSpace(String str) {
		String[] sArr = str.split(" ");
		Integer[] arr = new Integer[sArr.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sArr[i].equals("null") ? null : Integer.parseInt(sArr[i]);
		}
		return arr;
	}

	// Don't make any changes here.
	public static void main(String[] args) throws IOException {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Integer[] ar = inputSplitSpace(str);
		TreeNode root = construct(ar);

		int ret = new BinaryTree().findTilt(root);

		String out = String.valueOf(ret);

		System.out.print(out);
	}

}
