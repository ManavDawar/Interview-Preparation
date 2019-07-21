package trees;

import java.io.IOException;
import java.util.*;

public class BinaryTreeUpsideDown {

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

	public static void main(String[] args) throws IOException {

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		Integer[] ar = inputSplitSpace(str);
		TreeNode root = construct(ar);

		BinaryTree bt = new BinaryTree();
		TreeNode newRoot = bt.upsideDown(root);

		bt.inorder(newRoot);

	}

}

class TreeNode {
	TreeNode left, right;
	int data;

	TreeNode(int d) {
		data = d;
		left = right = null;
	}

}

class BinaryTree {

	public TreeNode upsideDown(TreeNode node) {
		// Write your code here.
		TreeNode curr = node;
		TreeNode temp = null;
		TreeNode par = null;
		TreeNode next = null;

		while (curr != null) {
			next = curr.left;
			curr.left = temp;
			temp = curr.right;
			curr.right = par;
			par = curr;
			curr = next;
		}

		return par;

	}

	void inorder(TreeNode node) {
		if (node == null)
			return;
		else
			inorder(node.left);
		System.out.print(node.data + " ");
		inorder(node.right);
	}

}
